package com.inspectorsunion.app.domain.dto.request;



import lombok.Data;

@Data
public class UpdateUserRequest {
    private String email; // Required to identify the user
    private String userName;
    //private String password;
    private String mobile;
    private Integer roleId;
    private Integer status;
}