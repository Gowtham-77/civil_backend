package com.inspectorsunion.app.domain.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MasterCertificate", schema = "iuc") // different table from Form
public class MasterForm {

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
    private String createdBy;
    private String verifiedBy;
    private String updatedBy;
    private LocalDate verifiedDate;

    @OneToMany(mappedBy = "masterForm", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<MasterTestResult> testsConducted = new ArrayList<>();
}