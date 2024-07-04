package com.sangwon.springlv2library.book;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private String language;
    @Column(nullable = false)
    private String publisher;
    @Column(nullable = false)
    private boolean available;
    @Column(nullable = false, updatable = false)
    private LocalDateTime registrationDate = LocalDateTime.now();

}
