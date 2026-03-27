package com.tiltalkapi.tiltalk.app.api.learn.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LearnWordItemDto {

    private Integer wordNo;
    private String level;
    private Integer categoryNo;
    private String korWord;
    private String korRomanization;
    private String korAudioUrl;
    private String kkWord;
    private String kkRomanization;
    private String kkAudioUrl;
    private String partOfSpeech;

}
