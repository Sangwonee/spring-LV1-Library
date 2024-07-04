package com.sangwon.springlv2library.rent;

import com.sangwon.springlv2library.book.Book;
import com.sangwon.springlv2library.book.BookRepository;
import com.sangwon.springlv2library.user.User;
import com.sangwon.springlv2library.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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




}
