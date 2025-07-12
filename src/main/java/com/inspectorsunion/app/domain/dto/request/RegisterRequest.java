package com.inspectorsunion.app.domain.dto.request;

import com.inspectorsunion.app.enums.Designation;
import lombok.Data;

@Data
public class RegisterRequest {
    private String userName;
    private String email;
    private String password;
    private String mobile;
    private Integer roleId;
    private Designation designation;
}
