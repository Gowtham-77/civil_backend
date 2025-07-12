package com.inspectorsunion.app.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "roles", schema = "iuc")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "role_id")
    private Integer roleId;

//    @Column(name = "role_name", nullable = false, unique = true)
    private String roleName;
}
