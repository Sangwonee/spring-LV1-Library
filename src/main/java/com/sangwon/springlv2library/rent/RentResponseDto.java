package com.sangwon.springlv2library.rent;



import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class RentResponseDto {

    private Long rentId;
    private Long bookId;
    private boolean returnStatus;
    private LocalDateTime rentDate;
    private LocalDateTime returnDate;
}
