package com.sangwon.springlv2library.user.entity;

import com.sangwon.springlv2library.rent.entity.Rent;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false, unique = true)
    private String idNumber;
    @Column(nullable = false, unique = true)
    private String phoneNumber;
    @Column(nullable = false)
    private String address;
    @Column
    private LocalDateTime penaltyEndDate;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Rent> rents;

    @PrePersist
    protected void onCreate() {
        penaltyEndDate = LocalDateTime.now();
    }
    public boolean hasPenalty() {
        return penaltyEndDate != null && LocalDateTime.now().isBefore(penaltyEndDate);
    }

    public void applyPenalty() {
        penaltyEndDate = LocalDateTime.now().plusWeeks(2);
    }
}
