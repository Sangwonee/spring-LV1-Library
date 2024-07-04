package com.sangwon.springlv2library.book;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookPostDto {
    private String title;
    private String author;
    private String language;
    private String publisher;


}
