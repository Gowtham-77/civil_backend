package com.inspectorsunion.app.domain.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoResponse {
    private String userName;
    private String email;
    private Integer roleId;
    private Integer status;
}
