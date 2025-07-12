package com.inspectorsunion.app.domain.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestConducted {
    private Boolean selected;
    private String description;
    private String result;
}