package com.sangwon.springlv2library.rent.mapper;

import com.sangwon.springlv2library.book.entity.Book;
import com.sangwon.springlv2library.rent.dto.RentDetailsDto;
import com.sangwon.springlv2library.rent.dto.RentHistoryResponseDto;
import com.sangwon.springlv2library.rent.dto.RentResponseDto;
import com.sangwon.springlv2library.rent.entity.Rent;
import com.sangwon.springlv2library.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RentMapper {

    RentResponseDto toResponseDto(Rent rent);
    @Mapping(source = "book.title", target = "title")
    @Mapping(source = "book.author", target = "author")
    RentDetailsDto toRentDetailsDto(Rent rent, Book book);
    @Mapping(source = "user.name", target = "name")
    @Mapping(source = "user.phoneNumber", target = "phoneNumber")
    RentHistoryResponseDto toRentHistoryResponseDto(User user, List<RentDetailsDto> rentedBooks);
}
