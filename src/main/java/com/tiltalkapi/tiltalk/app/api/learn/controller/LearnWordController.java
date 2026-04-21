package com.tiltalkapi.tiltalk.app.api.learn.controller;

import com.tiltalkapi.tiltalk.app.api.learn.dto.*;
import com.tiltalkapi.tiltalk.app.api.learn.service.LearnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/learn")
@RestController
@RequiredArgsConstructor
public class LearnWordController {

    final LearnWordService learnWordService;

    @GetMapping("/daily")
    List<LearnWordItemDto> getDailyLearnWords(LearnWordRequestDto requestDto){
        return learnWordService.getDailyLearnWords(requestDto);
    }

    @GetMapping("/daily/limit")
    UserSettingResultDto getDailyLearnLimit(UserSettingRequestDto requestDto){
        return learnWordService.getDailyLearnLimit(requestDto);
    }


    @PostMapping("/daily/progress")
    void saveDailyLearnWordProgress(@RequestBody SaveWordProgressRequestDto requestDto) {
        learnWordService.saveDailyLearnWordProgress(requestDto);
    }
}
