package com.tiltalkapi.tiltalk.app.api.learn.dto;

import com.tiltalkapi.tiltalk.app.api.data.UserDetails;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SaveWordProgressRequestDto extends UserDetails {

    int wordNo;
    int masteryLevel;
    int consecutiveHits;
    LocalDateTime nextReviewAt;

}
