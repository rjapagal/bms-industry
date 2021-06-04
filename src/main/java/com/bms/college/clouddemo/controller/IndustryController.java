package com.bms.college.clouddemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bms.college.clouddemo.model.AlarmModel;

@RestController
public class IndustryController {
	
	private AlarmModel alarmModel;
	
	@PostMapping(value="createAlarm", consumes="application/json", produces="application/json")
	public ResponseEntity<Void> cerateNewAlarm(@RequestBody AlarmModel alarmModelRequest) {
		alarmModel = alarmModelRequest;
		System.out.println(alarmModel.getAlarmName());
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping(value="/getAlarmStatus")
	public ResponseEntity<String> getAlarmStatus() {
		
		return new ResponseEntity<String>(Boolean.toString(alarmModel.isAlarmStatus()),HttpStatus.OK);
		
		
	}

}
