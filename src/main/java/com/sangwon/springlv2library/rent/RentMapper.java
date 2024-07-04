package com.sangwon.springlv2library.rent;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RentMapper {
    RentResponseDto toResponseDto(Rent rent);
}
