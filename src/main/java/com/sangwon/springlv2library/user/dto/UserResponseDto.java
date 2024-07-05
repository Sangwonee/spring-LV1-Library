package com.sangwon.springlv2library.user.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserResponseDto {
    private Long userId;
    private String name;
    private String gender;
    private String phoneNumber;
    private String address;
    private LocalDateTime penaltyEndDate;

}
