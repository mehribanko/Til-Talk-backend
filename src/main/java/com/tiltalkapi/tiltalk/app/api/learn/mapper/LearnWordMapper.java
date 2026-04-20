package com.tiltalkapi.tiltalk.app.api.learn.mapper;
import com.tiltalkapi.tiltalk.app.api.learn.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface LearnWordMapper {

    List<LearnWordItemDto> getDailyLearnWords(LearnWordRequestDto requestDto);

    UserSettingResultDto getDailyLearnLimit(UserSettingRequestDto requestDto);

    WordProgressResultDto getUserProgressPerWord(SaveWordProgressRequestDto requestDto);

    void saveDailyLearnWordProgress(SaveWordProgressRequestDto requestDto);

}
