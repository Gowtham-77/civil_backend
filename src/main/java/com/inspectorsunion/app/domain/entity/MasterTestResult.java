package com.inspectorsunion.app.domain.entity;



import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MasterTestResult", schema = "iuc")
public class MasterTestResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String performed;
    private String reportRef;
    private String description;
    private String result;

    @ManyToOne
    @JoinColumn(name = "master_form_certificate_no", nullable = false)
    @JsonBackReference
    private MasterForm masterForm;
}