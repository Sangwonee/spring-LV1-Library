package com.sangwon.springlv2library.book.service;

import com.sangwon.springlv2library.book.dto.BookPostDto;
import com.sangwon.springlv2library.book.dto.BookResponseDto;
import com.sangwon.springlv2library.book.entity.Book;
import com.sangwon.springlv2library.book.repository.BookRepository;
import com.sangwon.springlv2library.book.mapper.BookMapper;
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
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("책을 찾을 수 없습니다."));
        return bookMapper.toResponseDto(book);
    }

    public List<BookResponseDto> findAllBooks(){
        return bookMapper.toResponseDtos(bookRepository.findAll());
    }
}
