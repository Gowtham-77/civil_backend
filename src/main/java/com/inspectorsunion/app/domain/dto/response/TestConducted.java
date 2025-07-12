package com.inspectorsunion.app.domain.dto.response;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestConducted {
    private Boolean selected;
    private String description;
    private String result;

    public static TestConducted of(Boolean selected, String description, String result) {
        return new TestConducted(selected, description, result);
    }
}
