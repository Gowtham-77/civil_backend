package com.inspectorsunion.app.domain.dto.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Joint {
    private QualifiedFieldResponse pipeOrPlate;
    private QualifiedFieldResponse typeOfJoint;
    private QualifiedFieldResponse typeOfWeld;
    private QualifiedFieldResponse consumableInserts;
    private QualifiedFieldResponse backing;
    private QualifiedFieldResponse pipeDiameter;


    public static Joint of(QualifiedFieldResponse pipeOrPlate,
                           QualifiedFieldResponse typeOfJoint,
                           QualifiedFieldResponse typeOfWeld,
                           QualifiedFieldResponse consumableInserts,
                           QualifiedFieldResponse backing,
                           QualifiedFieldResponse pipeDiameter) {
        return new Joint(pipeOrPlate, typeOfJoint, typeOfWeld, consumableInserts, backing, pipeDiameter);
    }
}