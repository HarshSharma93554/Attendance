package com.example.demo.attendanceManagementJpaRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.attendanceManagementEntity.Attendance;

public interface AttendanceJpaRepo extends JpaRepository<Attendance,Long>{

}
