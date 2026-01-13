package com.example.UserManagement.repository;

import com.example.UserManagement.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserData,Integer> {

}
