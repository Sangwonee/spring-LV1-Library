package com.sangwon.springlv2library.user;

import org.mapstruct.Mapper;



@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserRequestDto userRequestDto);
    UserResponseDto toResponseDto(User user);
}
