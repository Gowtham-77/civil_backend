package com.inspectorsunion.app.domain.dto.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseMaterial {
    private QualifiedFieldResponse specificationNo;
    private QualifiedFieldResponse classificationNo;

    public static BaseMaterial of(QualifiedFieldResponse spec, QualifiedFieldResponse classification) {
        return new BaseMaterial(spec, classification);
    }
}