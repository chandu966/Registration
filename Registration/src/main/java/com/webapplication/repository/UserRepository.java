package com.webapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapplication.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
