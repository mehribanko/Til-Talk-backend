package com.tiltalkapi.tiltalk.app.api.data;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDetails {

    private int userId;
    private int dailyWordLimit;
    private String nativeLang;
    private String targetLang;


}
