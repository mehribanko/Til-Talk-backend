package com.tiltalkapi.tiltalk.app.api.learn.service;

import com.tiltalkapi.tiltalk.app.api.learn.dto.*;
import com.tiltalkapi.tiltalk.app.api.learn.mapper.LearnWordMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
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

    @Transactional
    public void saveDailyLearnWordProgress(SaveWordProgressRequestDto requestDto){

        LocalDateTime now = LocalDateTime.now();

        LocalDateTime plus3Days = now.plusDays(3);
        requestDto.setUserId(1);
        requestDto.setMasteryLevel(1);
        requestDto.setConsecutiveHits(1);
        requestDto.setNextReviewAt(plus3Days);

        learnWordMapper.saveDailyLearnWordProgress(requestDto);

    }


    private WordProgressResultDto getUserProgressPerWord(SaveWordProgressRequestDto requestDto){

        return learnWordMapper.getUserProgressPerWord(requestDto);

    }

}
