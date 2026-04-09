package com.tiltalkapi.tiltalk.app.api.learn.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class UserSettingResultDto {

    private long userId;

    private int dailyWordLimit;

    private String nativeLang;

    private String targetLang;

    private DateTimeFormatter lastLimitUpdate;

}
