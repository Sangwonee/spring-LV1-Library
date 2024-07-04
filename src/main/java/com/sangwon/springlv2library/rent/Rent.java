package com.sangwon.springlv2library.rent;

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
    @Column(nullable = false)
    private Long bookId;
    @Column(nullable = false)
    private Long userId;
    @Column(nullable = false)
    private boolean returnStatus = false;
    @Column(nullable = false, updatable = false)
    private LocalDateTime rentDate = LocalDateTime.now();
    private LocalDateTime returnDate;
}
