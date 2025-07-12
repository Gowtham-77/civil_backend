package com.inspectorsunion.app.domain.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class QualifiedField {
    private String actual;
    private String rangeQualified;
    public static QualifiedField of(String actual, String range) {
        QualifiedField qf = new QualifiedField();
        qf.setActual(actual);
        qf.setRangeQualified(range);
        return qf;
    }
}