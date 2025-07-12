package com.inspectorsunion.app.domain.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FillerMetal {
    private QualifiedFieldResponse specification;
    private QualifiedFieldResponse classification;
    @JsonProperty("fNumber")
    private QualifiedFieldResponse fNumber;

    public static FillerMetal of(QualifiedFieldResponse spec, QualifiedFieldResponse classif, QualifiedFieldResponse fNumber) {
        return new FillerMetal(spec, classif, fNumber);
    }
}