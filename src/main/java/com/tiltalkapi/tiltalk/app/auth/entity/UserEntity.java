package com.tiltalkapi.tiltalk.app.auth.entity;

import lombok.Data;

@Data
public class UserEntity {

    private Long id;
    private String name;
    private String password;
    private String Role;

}
