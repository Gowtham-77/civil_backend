package com.inspectorsunion.app.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeldingParameters {
    private QualifiedField position;
    private QualifiedField progression;
    private QualifiedField gasBacking;
    private QualifiedField currentPolarity;
}
