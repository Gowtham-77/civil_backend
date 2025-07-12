package com.inspectorsunion.app.domain.dto.response;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WqtResponse {
    private String certificateNo;
    private String jobNo;
    private String welderName;
    private String welderStampNo;
    private String welderIdNo;
    private String passportNo;
    private String iqamaNo;
    private String nationality;
    private String wpsNo;
    private String thickness;
    private String baseMeterial;
    private String clientOrContractor;
    private String inspectorNameCertNo;
    private String clientRepName;
    private LocalDate testDate;
    private QualifiedFieldResponse weldingProcess;
    private BaseMaterial baseMaterial;
    private Joint joint;
    private FillerMetal fillerMetal;
    private DepositedThickness depositedThickness;
    private WeldingParameters weldingParameters;
    private TestConductedGroup testsConducted;
}