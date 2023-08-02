package com.example.demo.attendanceManagementJpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.attendanceManagementEntity.Message;

public interface MessageJpaRepo extends JpaRepository<Message,Long> {

}
