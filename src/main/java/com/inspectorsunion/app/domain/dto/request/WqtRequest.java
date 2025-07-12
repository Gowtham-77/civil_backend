package com.inspectorsunion.app.domain.dto.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WqtRequest {
    private String certificateNo;
    private String jobNo;
    private String welderName;
    private String welderStampNo;
    private String welderIdNo;
    private String passportNo;
    private String iqamaNo;
    private String nationality;
    private String wpsNo;
    private String baseMeterial;
    private String thickness;
    private String clientOrContractor;
    private String inspectorNameCertNo;
    private String clientRepName;
    private LocalDate testDate;
    @JsonProperty("createdBy")
    private String createdBy;
    private String verifiedBy;
    private String updatedBy;
    private LocalDate updatedDate;

    private QualifiedField weldingProcess;
    private BaseMaterial baseMaterial;
    private Joint joint;
    private FillerMetal fillerMetal;
    private DepositedThickness depositedThickness;
    private WeldingParameters weldingParameters;
    private TestConductedGroup testsConducted;
    private String remarks="pending";
    private String status="pending";

}
