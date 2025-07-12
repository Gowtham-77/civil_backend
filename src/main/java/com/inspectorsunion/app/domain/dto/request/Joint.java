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
public class Joint {
    private QualifiedField pipeOrPlate;
    private QualifiedField typeOfJoint;
    private QualifiedField typeOfWeld;
    private QualifiedField consumableInserts;
    @JsonProperty("backing")
    private QualifiedField backing;
    private QualifiedField pipeDiameter;
}
