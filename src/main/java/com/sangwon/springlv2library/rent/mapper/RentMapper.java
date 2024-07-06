package com.sangwon.springlv2library.rent.mapper;

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
    @Mapping(source = "book.bookId", target = "bookId")
    @Mapping(source = "user.userId", target = "userId")
    RentResponseDto toResponseDto(Rent rent);
    @Mapping(source = "book.title", target = "title")
    @Mapping(source = "book.author", target = "author")
    RentDetailsDto toRentDetailsDto(Rent rent);

    List<RentDetailsDto> toRentDetailsDtos(List<Rent> rents); // 새로운 메서드 추가

    RentHistoryResponseDto toRentHistoryResponseDto(User user, List<RentDetailsDto> rentedBooks);
}
