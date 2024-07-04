package com.sangwon.springlv2library.book;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book toEntity(BookPostDto bookPostDto);
    List<BookResponseDto> toResponseDtos(List<Book> books);
    BookResponseDto toResponseDto(Book book);

}
