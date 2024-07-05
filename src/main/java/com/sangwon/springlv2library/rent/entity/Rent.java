package com.sangwon.springlv2library.rent.entity;

import com.sangwon.springlv2library.rent.dto.ReturnStatus;
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
