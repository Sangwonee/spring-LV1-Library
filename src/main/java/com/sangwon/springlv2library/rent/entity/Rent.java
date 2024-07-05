package com.sangwon.springlv2library.rent.entity;

import com.sangwon.springlv2library.book.entity.Book;
import com.sangwon.springlv2library.rent.dto.ReturnStatus;
import com.sangwon.springlv2library.user.entity.User;
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
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ReturnStatus returnStatus;
    @Column(nullable = false, updatable = false)
    private LocalDateTime rentDate;
    private LocalDateTime returnDate;

    @PrePersist
    protected void onCreate() {
        rentDate = LocalDateTime.now();
        returnStatus = ReturnStatus.RENTED;
    }
}
