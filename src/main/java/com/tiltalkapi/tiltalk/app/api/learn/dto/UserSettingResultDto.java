package com.tiltalkapi.tiltalk.app.api.learn.dto;

import com.tiltalkapi.tiltalk.app.api.data.UserDetails;
import lombok.Getter;
import lombok.Setter;

import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class UserSettingResultDto extends UserDetails {

    private DateTimeFormatter lastLimitUpdate;

}
