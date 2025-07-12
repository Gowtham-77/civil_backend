package com.inspectorsunion.app.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ApprovedCertificateInfo {
    private String certificateNo;
    private String clientOrContractor;
    private String updatedBy;
    private LocalDate testDate;
    private String createdBy;
    private LocalDate updatedDate;
    private LocalDate verifiedDate;
    private String verifiedBy;
}