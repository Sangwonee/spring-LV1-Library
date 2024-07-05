package com.sangwon.springlv2library.rent.controller;

import com.sangwon.springlv2library.rent.dto.RentHistoryResponseDto;
import com.sangwon.springlv2library.rent.dto.RentResponseDto;
import com.sangwon.springlv2library.rent.service.RentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class RentController {
    private final RentService rentService;

    @PostMapping("/books/{bookId}/rents")
    public ResponseEntity<RentResponseDto> rentBook(@PathVariable Long bookId, @RequestHeader Long userId) {
        RentResponseDto rentResponseDto = rentService.rentBook(bookId,userId);
        return new ResponseEntity<>(rentResponseDto, HttpStatus.CREATED);
    }
    @PatchMapping("/books/{bookId}/return")
    public ResponseEntity<RentResponseDto> returnBook(@PathVariable Long bookId, @RequestHeader Long userId){
        RentResponseDto rentResponseDto = rentService.returnBook(bookId,userId);
        return new ResponseEntity<>(rentResponseDto, HttpStatus.CREATED);
    }
    @GetMapping("/users/rents")
    public ResponseEntity<RentHistoryResponseDto> getUserRentHistory(@RequestHeader Long userId){
        RentHistoryResponseDto rentHistoryResponseDto = rentService.rentList(userId);
        return new ResponseEntity<>(rentHistoryResponseDto,HttpStatus.OK);
    }

}

