package com.inspectorsunion.app.domain.dto.response;

import com.inspectorsunion.app.domain.entity.TestResult;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestConductedGroup {
    private TestConducted bendTest;
    private TestConducted radiography;
    private TestConducted ultrasonic;
    private TestConducted macroEtch;
    private TestConducted fracture;
    private TestConducted other;

    public static TestConductedGroup fromTestResults(List<TestResult> results) {
        TestConductedGroup group = new TestConductedGroup();
        for (TestResult result : results) {
            switch (result.getType()) {
                case "Bend Test" -> group.setBendTest(new TestConducted(true, result.getDescription(), result.getResult()));
                case "Radiography" -> group.setRadiography(new TestConducted(true, result.getDescription(), result.getResult()));
                case "Ultrasonic" -> group.setUltrasonic(new TestConducted(true, result.getDescription(), result.getResult()));
                case "Macro Etch" -> group.setMacroEtch(new TestConducted(true, result.getDescription(), result.getResult()));
                case "Fracture" -> group.setFracture(new TestConducted(true, result.getDescription(), result.getResult()));
                case "Other" -> group.setOther(new TestConducted(true, result.getDescription(), result.getResult()));
            }
        }
        return group;
    }
}