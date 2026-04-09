package com.tiltalkapi.tiltalk.app.api.learn.service;

import com.tiltalkapi.tiltalk.app.api.learn.dto.LearnWordItemDto;
import com.tiltalkapi.tiltalk.app.api.learn.dto.LearnWordRequestDto;
import com.tiltalkapi.tiltalk.app.api.learn.dto.UserSettingRequestDto;
import com.tiltalkapi.tiltalk.app.api.learn.dto.UserSettingResultDto;
import com.tiltalkapi.tiltalk.app.api.learn.mapper.LearnWordMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LearnWordService {

    final LearnWordMapper learnWordMapper;

    public List<LearnWordItemDto> getDailyLearnWords(LearnWordRequestDto requestDto){
        return learnWordMapper.getDailyLearnWords(requestDto);
    }

    public UserSettingResultDto getDailyLearnLimit(UserSettingRequestDto requestDto){
        requestDto.setUserId(1);
        return learnWordMapper.getDailyLearnLimit(requestDto);
    }
}
