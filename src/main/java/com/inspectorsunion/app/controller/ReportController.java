package com.inspectorsunion.app.controller;

import com.inspectorsunion.app.domain.dto.request.ApproveFormRequest;
import com.inspectorsunion.app.domain.dto.request.RejectionRequest;
import com.inspectorsunion.app.domain.dto.response.ApprovedCertificateInfo;
import com.inspectorsunion.app.domain.dto.response.PendingCertificateInfo;
import com.inspectorsunion.app.domain.dto.response.RejectedCertificateInfo;
import com.inspectorsunion.app.domain.entity.Form;
import com.inspectorsunion.app.domain.dto.request.WqtRequest;
import com.inspectorsunion.app.domain.dto.response.WqtResponse;
import com.inspectorsunion.app.service.ReportService;
import com.inspectorsunion.app.utils.WqtMapper;
import jakarta.annotation.security.PermitAll;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/reports")
@RequiredArgsConstructor
public class ReportController {

    @Autowired
    private final ReportService reportService;

    // Save form only
    @PostMapping("/wqt/save")
    public ResponseEntity<Form> saveWqtForm(@RequestBody WqtRequest request) throws Exception {
        Form form = reportService.saveWqtDataOnly(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(form);
    }

    // Generate & download PDF
    @PostMapping("/wqt/download")
    public ResponseEntity<byte[]> generateWqtPdf(@RequestBody WqtRequest request) throws Exception {
        byte[] pdf = reportService.generateWqtPdfAndSave(request);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDisposition(ContentDisposition.attachment().filename("WQT_Report.pdf").build());
        return new ResponseEntity<>(pdf, headers, HttpStatus.OK);
    }

    // Fetch saved data in nested response structure
    @GetMapping("/{certificateNo}")
    public ResponseEntity<WqtResponse> getForm(@PathVariable String certificateNo) {
        Form form = reportService.getFormByCertificateNo(certificateNo);
        if (form == null) {
            return ResponseEntity.notFound().build();
        }
        WqtResponse response = WqtMapper.mapToWqtResponse(form);
        return ResponseEntity.ok(response);
    }

    //pending
    @GetMapping("/pending-certificates")
    public ResponseEntity<List<PendingCertificateInfo>> getPendingCertificates() {
        return ResponseEntity.ok(reportService.getPendingCertificateInfos());
    }


    //Approve
    @GetMapping("/approved-certificates")
    public ResponseEntity<List<ApprovedCertificateInfo>> getApprovedInfo() {
        return ResponseEntity.ok(reportService.getApprovedCertificateDetails());
    }

    //Rejected
    @GetMapping("/rejected-certificates")
    public ResponseEntity<List<RejectedCertificateInfo>> getRejectedInfo() {
        return ResponseEntity.ok(reportService.getRejectedCertificateDetails());
    }

    //download by cerfNo
    @GetMapping("/wqt/download/{certificateNo}")
    public ResponseEntity<byte[]> downloadWqtPdfByCertificate(@PathVariable String certificateNo) throws Exception {
        byte[] pdf = reportService.generateWqtPdfFromSavedData(certificateNo);
        if (pdf == null) return ResponseEntity.notFound().build();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDisposition(ContentDisposition.attachment().filename("WQT_Report_" + certificateNo + ".pdf").build());
        return new ResponseEntity<>(pdf, headers, HttpStatus.OK);
    }

    //View PDF
    @GetMapping("/wqt/view/{certificateNo}")
    @PermitAll
    public ResponseEntity<byte[]> viewWqtPdfInBrowser(@PathVariable String certificateNo) throws Exception {
        byte[] pdf = reportService.generateWqtPdfFromSavedData(certificateNo);
        if (pdf == null) return ResponseEntity.notFound().build();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDisposition(ContentDisposition.inline().filename("WQT_Report_" + certificateNo + ".pdf").build());
        return new ResponseEntity<>(pdf, headers, HttpStatus.OK);
    }


    //rejectTheForm
    @PostMapping("/form/reject")
    public ResponseEntity<String> rejectForm(@RequestBody RejectionRequest request) {
        boolean updated = reportService.rejectWqtForm(request);
        if (updated) {
            return ResponseEntity.ok("Form rejected ");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Form not found.");
        }
    }

    //approveForm
    @PostMapping("/form/approve")
    public ResponseEntity<String> approveForm(@RequestBody ApproveFormRequest request) {
        reportService.approveForm(request);
        return ResponseEntity.ok("Form approved ");
    }


}