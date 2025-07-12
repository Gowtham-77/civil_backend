package com.inspectorsunion.app.domain.dto.request;



import lombok.Data;

@Data
public class RejectionRequest {
    private String certificateNo;
    private String remarks;
    private String verifiedBy; // used instead of rejectedBy
    private String verifiedDate;
}