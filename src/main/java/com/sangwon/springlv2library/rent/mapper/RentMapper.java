package com.sangwon.springlv2library.rent.mapper;

import com.sangwon.springlv2library.rent.dto.RentDetailsDto;
import com.sangwon.springlv2library.rent.dto.RentHistoryResponseDto;
import com.sangwon.springlv2library.rent.dto.RentResponseDto;
import com.sangwon.springlv2library.rent.entity.Rent;
import com.sangwon.springlv2library.user.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RentMapper {

    RentResponseDto toResponseDto(Rent rent);
    RentDetailsDto toRentDetailsDto(Rent rent);

    List<RentDetailsDto> toRentDetailsDtos(List<Rent> rents); // 새로운 메서드 추가

    RentHistoryResponseDto toRentHistoryResponseDto(User user, List<RentDetailsDto> rentedBooks);
}
