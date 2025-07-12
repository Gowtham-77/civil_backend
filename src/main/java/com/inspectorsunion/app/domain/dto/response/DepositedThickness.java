package com.inspectorsunion.app.domain.dto.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepositedThickness {
    private QualifiedFieldResponse gtawSmaw;
    private QualifiedFieldResponse specification;

    public static DepositedThickness of(QualifiedFieldResponse gtawSmaw, QualifiedFieldResponse spec) {
        return new DepositedThickness(gtawSmaw, spec);
    }
}