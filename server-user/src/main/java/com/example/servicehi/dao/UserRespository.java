package com.example.servicehi.dao;

import com.example.servicehi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<User,Long> {
}
