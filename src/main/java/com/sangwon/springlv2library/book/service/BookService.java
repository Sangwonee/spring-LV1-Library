package com.sangwon.springlv2library.book.service;

import com.sangwon.springlv2library.book.dto.BookPostDto;
import com.sangwon.springlv2library.book.dto.BookResponseDto;
import com.sangwon.springlv2library.book.entity.Book;
import com.sangwon.springlv2library.book.repository.BookRepository;
import com.sangwon.springlv2library.book.mapper.BookMapper;
import com.sangwon.springlv2library.exception.BusinessLogicException;
import com.sangwon.springlv2library.exception.ExceptionCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;


    public BookResponseDto createBook(BookPostDto bookPostDto){
        Book book = bookMapper.toEntity(bookPostDto);
        return bookMapper.toResponseDto(bookRepository.save(book));
    }

    public BookResponseDto findBook(Long id){
        Book book = bookRepository.findById(id).orElseThrow(() -> new BusinessLogicException(ExceptionCode.BOOK_NOT_FOUND));
        return bookMapper.toResponseDto(book);
    }

    public List<BookResponseDto> findAllBooks(){
        List<Book> books = bookRepository.findAllByOrderByRegistrationDateAsc();
        return bookMapper.toResponseDtos(books);
    }
}
