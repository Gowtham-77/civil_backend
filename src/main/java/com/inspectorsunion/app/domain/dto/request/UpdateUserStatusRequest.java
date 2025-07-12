package com.inspectorsunion.app.domain.dto.request;




import lombok.Data;

@Data
public class UpdateUserStatusRequest {
    private String userName;
    private Integer currentStatus; // Current status sent from UI
}