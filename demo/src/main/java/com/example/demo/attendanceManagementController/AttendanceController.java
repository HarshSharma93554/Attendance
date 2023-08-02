package com.example.demo.attendanceManagementController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.attendanceManagementEntity.*;
import com.example.demo.attendanceManagementJpaRepo.AttendanceJpaRepo;
import com.example.demo.attendanceManagementJpaRepo.MessageJpaRepo;
import com.example.demo.attendanceManagementService.AttendanceManagementService;

@RestController
@RequestMapping("api/v1/attendance")
public class AttendanceController {

	
	@Autowired
	private AttendanceManagementService attendanceManagementService;
	
	@Autowired
	private MessageJpaRepo messageJpaRepo;
	
	@PostMapping
	private ResponseEntity<User> createUser(@RequestBody Message message){
		String sage= null;
		if(message.getCheckedIn()>0) {
		 sage = "Name: " + message.getName()+"\n UUId: "+message.getUuid()+"\n checkedIN: "+message.getCheckedIn();
		   messageJpaRepo.save(message);
		}else {
			 sage = message.getName()+" "+message.getUuid()+""+message.getCheckedOut();
			 messageJpaRepo.save(message);
		}
	return	attendanceManagementService.createUser(sage);
		
}
}
