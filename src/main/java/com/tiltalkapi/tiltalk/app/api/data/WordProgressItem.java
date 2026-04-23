package com.tiltalkapi.tiltalk.app.api.data;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class WordProgressItem {

    private int word_no;
    private int user_id;
    LocalDateTime lastReviewedAt;
    LocalDateTime createdAt;
}
