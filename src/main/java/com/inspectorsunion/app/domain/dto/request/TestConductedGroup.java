package com.inspectorsunion.app.domain.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TestConductedGroup {
    private TestConducted bendTest;
    private TestConducted radiography;
    private TestConducted ultrasonic;
    private TestConducted macroEtch;
    private TestConducted fracture;
    private TestConducted other;
}
