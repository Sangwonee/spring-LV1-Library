package com.sangwon.springlv2library.user;

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
