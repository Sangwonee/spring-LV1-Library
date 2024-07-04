package com.sangwon.springlv2library.rent;

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


}

