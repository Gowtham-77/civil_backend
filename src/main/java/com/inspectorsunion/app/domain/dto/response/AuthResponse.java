package com.inspectorsunion.app.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class AuthResponse {
    private String token;
    private String userName;
    private int RoleId;
    private int status;
}
