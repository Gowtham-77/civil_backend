package com.inspectorsunion.app.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseMaterial {
    private QualifiedField specificationNo;
    private QualifiedField classificationNo;
}
