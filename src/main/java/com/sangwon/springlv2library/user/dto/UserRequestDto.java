package com.sangwon.springlv2library.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
    private String name;
    private String gender;
    private String idNumber;
    private String phoneNumber;
    private String address;
}
