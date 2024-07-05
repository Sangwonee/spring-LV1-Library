package com.sangwon.springlv2library.rent.repository;

import com.sangwon.springlv2library.rent.dto.ReturnStatus;
import com.sangwon.springlv2library.rent.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RentRepository extends JpaRepository<Rent, Long> {
    Optional<Rent> findByBookIdAndUserIdAndReturnStatus(Long bookId, Long userId, ReturnStatus returnStatus);
    List<Rent> findByUserId(Long userId);

    List<Rent> findByUserUserIdOrderByRentDateAsc(Long userId);
}
