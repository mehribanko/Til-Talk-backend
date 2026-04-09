package com.tiltalkapi.tiltalk.app.api.learn.mapper;
import com.tiltalkapi.tiltalk.app.api.learn.dto.LearnWordItemDto;
import com.tiltalkapi.tiltalk.app.api.learn.dto.LearnWordRequestDto;
import com.tiltalkapi.tiltalk.app.api.learn.dto.UserSettingRequestDto;
import com.tiltalkapi.tiltalk.app.api.learn.dto.UserSettingResultDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface LearnWordMapper {

    List<LearnWordItemDto> getDailyLearnWords(LearnWordRequestDto requestDto);

    UserSettingResultDto getDailyLearnLimit(UserSettingRequestDto requestDto);

}
