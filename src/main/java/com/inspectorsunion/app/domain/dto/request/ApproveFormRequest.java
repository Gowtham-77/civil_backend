package com.inspectorsunion.app.domain.dto.request;

import lombok.Data;

@Data
public class ApproveFormRequest {
    private String certificateNo;
    private String remarks;
    private String verifiedBy;
    private String verifiedDate;
}