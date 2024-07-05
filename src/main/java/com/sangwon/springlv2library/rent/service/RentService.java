package com.sangwon.springlv2library.rent.service;

import com.sangwon.springlv2library.book.entity.Book;
import com.sangwon.springlv2library.book.repository.BookRepository;
import com.sangwon.springlv2library.rent.dto.RentDetailsDto;
import com.sangwon.springlv2library.rent.dto.RentHistoryResponseDto;
import com.sangwon.springlv2library.rent.dto.RentResponseDto;
import com.sangwon.springlv2library.rent.dto.ReturnStatus;
import com.sangwon.springlv2library.rent.entity.Rent;
import com.sangwon.springlv2library.rent.mapper.RentMapper;
import com.sangwon.springlv2library.rent.repository.RentRepository;
import com.sangwon.springlv2library.user.entity.User;
import com.sangwon.springlv2library.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RentService {

    private final RentRepository rentRepository;
    private final BookRepository bookRepository;
    private final UserRepository userRepository;
    private final RentMapper rentMapper;

    public RentResponseDto rentBook(Long bookId, Long userId) {
        Rent rent = new Rent();
        rent.setBookId(bookId);
        rent.setUserId(userId);
        return rentMapper.toResponseDto(rentRepository.save(rent));
    }

    public RentResponseDto returnBook(Long bookId, Long userId){
        Rent rent = rentRepository.findByBookIdAndUserIdAndReturnStatus(bookId, userId, ReturnStatus.RENTED)
                .orElseThrow(() -> new RuntimeException("No active rent found for this book and user"));
        rent.setReturnStatus(ReturnStatus.RETURNED);
        rent.setReturnDate(LocalDateTime.now());

        return rentMapper.toResponseDto(rentRepository.save(rent));
    }

    public RentHistoryResponseDto rentList(Long userId){
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        List<Rent> rents = rentRepository.findByUserId(userId);

        List<RentDetailsDto> rentedBooks = new ArrayList<>();
        for (Rent rent : rents) {
            Book book = bookRepository.findById(rent.getBookId()).orElseThrow(() -> new RuntimeException("Book not found"));
            RentDetailsDto rentDetailsDto = rentMapper.toRentDetailsDto(rent, book);
            rentedBooks.add(rentDetailsDto);
        }

        return rentMapper.toRentHistoryResponseDto(user, rentedBooks);

    }



}
