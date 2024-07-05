package com.sangwon.springlv2library.book.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class BookResponseDto {
    private Long bookId;
    private String title;
    private String author;
    private String language;
    private String publisher;
    private boolean available;
    private LocalDateTime registrationDate;
}
