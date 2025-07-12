package com.inspectorsunion.app.domain.dto.response;



import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeldingParameters {
    private QualifiedFieldResponse position;
    private QualifiedFieldResponse progression;
    private QualifiedFieldResponse gasBacking;
    private QualifiedFieldResponse currentPolarity;

    public static WeldingParameters of(QualifiedFieldResponse pos, QualifiedFieldResponse prog, QualifiedFieldResponse gas, QualifiedFieldResponse curr) {
        return new WeldingParameters(pos, prog, gas, curr);
    }
}
