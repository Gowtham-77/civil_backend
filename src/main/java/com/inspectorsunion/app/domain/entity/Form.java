package com.inspectorsunion.app.domain.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Certificate", schema = "iuc")
public class Form {

    @Id
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
    private String clientOrContractor;
    //private String baseMaterialActual;
    //private String baseMaterialRangeQualified;
    private String materialClassificationActual;
    private String materialClassificationRangeQualified;
    private String pipeDiameterActual;
    private String pipeDiameterRangeQualified;
    private String fillerMetalSpecActual;
    private String fillerMetalSpecRangeQualified;
    private String fillerMetalClassificationActual;
    private String fillerMetalClassificationRangeQualified;
    @Column(name = "f_number_actual")
    private String fNumberActual;

    @Column(name = "f_number_range_qualified")
    private String fNumberRangeQualified;
    private String depositedThicknessActual;
    private String depositedThicknessRangeQualified;
    private String weldingProcessActual;
    private String weldingProcessRangeQualified;
   // private String weldingTypeActual;
   // private String weldingTypeRangeQualified;
    private String jointTypeActual;
    private String jointTypeRangeQualified;
    private String weldTypeActual;
    private String weldTypeRangeQualified;
    private String pipeOrPlateActual;
    private String pipeOrPlateRangeQualified;
    private String consumableInsertActual;
    private String consumableInsertRangeQualified;
    private String backingActual;
    private String backingRangeQualified;
    private String positionActual;
    private String positionRangeQualified;
    private String progressionActual;
    private String progressionRangeQualified;
    private String gasBackingActual;
    private String gasBackingRangeQualified;
    private String currentPolarityActual;
    private String currentPolarityRangeQualified;
    private String metalSpecificationNoActual;
    private String metalSpecificationNoRangeQualified;
    private String depositedSpecificationActual;
    private String depositedSpecificationRangeQualified;
    private String baseMeterial;
    private LocalDate testDate;
    private String inspectorName;
    private String inspectorCertNo;
    private String clientRepName;
    private String remarks;
    private String status;
    @Column(name = "created_by")
    private String createdBy;
    private String verifiedBy;
    private String updatedBy;
    private LocalDate updatedDate;
    private LocalDate verifiedDate;

    @OneToMany(mappedBy = "form", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<TestResult> testsConducted = new ArrayList<>();



}
