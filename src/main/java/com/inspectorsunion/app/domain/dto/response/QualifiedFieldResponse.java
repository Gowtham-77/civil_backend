package com.inspectorsunion.app.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QualifiedFieldResponse {
    private String actual;
    private String rangeQualified;
    public static QualifiedFieldResponse of(String actual, String rangeQualified) {
        return new QualifiedFieldResponse(actual, rangeQualified);
    }
}
