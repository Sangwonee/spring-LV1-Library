package com.sangwon.springlv2library.rent.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RentDetailsDto {
    private String title;
    private String author;
    private LocalDateTime rentDate;
    private ReturnStatus returnStatus;
}
