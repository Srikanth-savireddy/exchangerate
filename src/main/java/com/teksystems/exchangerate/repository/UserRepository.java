package com.teksystems.exchangerate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teksystems.exchangerate.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserid(String userid);
}
