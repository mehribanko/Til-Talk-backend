package com.tiltalkapi.tiltalk.app.api.learn.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSettingRequestDto {

    private long userId;

    private String targetLang;
}
