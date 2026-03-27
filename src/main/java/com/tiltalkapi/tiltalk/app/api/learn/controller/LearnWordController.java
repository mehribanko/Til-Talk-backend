package com.tiltalkapi.tiltalk.app.api.learn.controller;

import com.tiltalkapi.tiltalk.app.api.learn.dto.LearnWordItemDto;
import com.tiltalkapi.tiltalk.app.api.learn.dto.LearnWordRequestDto;
import com.tiltalkapi.tiltalk.app.api.learn.service.LearnWordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
