package com.inspectorsunion.app.domain.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TestResult", schema = "iuc")
public class TestResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String performed;
    private String reportRef;
    private String description;
    private String result;


    @ManyToOne
    @JoinColumn(name = "form_certificate_no", nullable = false)
    @JsonBackReference
    private Form form;
}
