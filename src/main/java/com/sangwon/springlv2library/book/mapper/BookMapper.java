package com.sangwon.springlv2library.book.mapper;

import com.sangwon.springlv2library.book.dto.BookPostDto;
import com.sangwon.springlv2library.book.dto.BookResponseDto;
import com.sangwon.springlv2library.book.entity.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {
    Book toEntity(BookPostDto bookPostDto);
    List<BookResponseDto> toResponseDtos(List<Book> books);
    BookResponseDto toResponseDto(Book book);

}
