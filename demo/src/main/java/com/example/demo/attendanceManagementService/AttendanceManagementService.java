package com.example.demo.attendanceManagementService;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.accept.HeaderContentNegotiationStrategy;
import org.springframework.web.client.RestTemplate;

import com.example.demo.attendanceManagementEntity.User;
import com.example.demo.attendanceManagementJpaRepo.*;

@Service
public class AttendanceManagementService {
	
	private final RestTemplate restTemplate;
	
	@Autowired
	private UserAttendanceManagementJpaRepo userAttendanceManagementJpaRepo;
	
	@Autowired
	private AttendanceJpaRepo AttendanceJpaRepo;
	
	public ResponseEntity<User> createUser(String Message){
		try {		
			String url="https://hooks.slack.com/services/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";
			Map<String,String> messageBuilder = new HashMap<>();
			HttpHeaders httpheaders = new HttpHeaders();
			
			
			httpheaders.setContentType(MediaType.APPLICATION_JSON);
			messageBuilder.put("text",Message);
			
			HttpEntity<Map<String, String>> request = new HttpEntity<>(messageBuilder,httpheaders);
			restTemplate.postForEntity(url, request, String.class);
			
			
			return new  ResponseEntity<User>(HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new  ResponseEntity<User>(HttpStatus.BAD_REQUEST);
		}
	}
	
	public AttendanceManagementService(RestTemplate restTemplate) {
		this.restTemplate =restTemplate;
	}
	
	

}
