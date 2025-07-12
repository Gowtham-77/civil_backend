package com.inspectorsunion.app.domain.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FillerMetal {
    private QualifiedField specification;
    private QualifiedField classification;
    @JsonProperty("fNumber")
    private QualifiedField fNumber;
}
