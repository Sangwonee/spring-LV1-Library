package com.sangwon.springlv2library.user.service;

import com.sangwon.springlv2library.user.dto.UserRequestDto;
import com.sangwon.springlv2library.user.entity.User;
import com.sangwon.springlv2library.user.dto.UserResponseDto;
import com.sangwon.springlv2library.user.mapper.UserMapper;
import com.sangwon.springlv2library.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserResponseDto createUser(UserRequestDto userRequestDto){
        User user = userMapper.toEntity(userRequestDto);
        return userMapper.toResponseDto(userRepository.save(user));
    }
}
