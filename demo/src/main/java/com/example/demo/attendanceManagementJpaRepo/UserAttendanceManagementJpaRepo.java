package com.example.demo.attendanceManagementJpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.attendanceManagementEntity.User;

public interface UserAttendanceManagementJpaRepo extends JpaRepository<User,Long> {

}
