package com.sangwon.springlv2library.user.mapper;

import com.sangwon.springlv2library.user.dto.UserRequestDto;
import com.sangwon.springlv2library.user.dto.UserResponseDto;
import com.sangwon.springlv2library.user.entity.User;
import org.mapstruct.Mapper;



@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserRequestDto userRequestDto);
    UserResponseDto toResponseDto(User user);
}
