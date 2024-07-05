package com.sangwon.springlv2library.rent.dto;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class RentResponseDto {

    private Long rentId;
    private Long bookId;
    private ReturnStatus returnStatus;
    private LocalDateTime rentDate;
    private LocalDateTime returnDate;


}
