package com.example.demo.attendanceManagementEntity;


import java.util.UUID;


import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "user")
public  @Data class User {
	@Id
	@Column(name = "uuid")
	private UUID uuid;
	

	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(strategy = "native", name = "native")
	private long id;
	
	
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "attendance_id")
	private Attendance attendance;
	
	
}
