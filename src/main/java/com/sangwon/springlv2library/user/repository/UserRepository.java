package com.sangwon.springlv2library.user.repository;

import com.sangwon.springlv2library.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
