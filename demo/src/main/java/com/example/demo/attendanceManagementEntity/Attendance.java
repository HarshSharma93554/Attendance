package com.example.demo.attendanceManagementEntity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "attendance")
@Data
public class Attendance {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(strategy = "native", name = "native")
	private long id;
	
	
	@Column(name = "checked_in")
	private int checkedIn;
	
	@Column(name = "checked_out")
	private int checkedOut;
	
	
	
	
	
}
