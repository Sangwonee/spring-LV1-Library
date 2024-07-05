package com.sangwon.springlv2library.rent.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RentHistoryResponseDto {
    private String name;
    private String phoneNumber;
    private List<RentDetailsDto> rentedBooks;
}
