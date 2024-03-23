package com.aws.controller;

import java.net.http.HttpResponse;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@CrossOrigin ("*/")
public class DemoController {

	@GetMapping("/welcome")
	public ResponseEntity<Map<String, Object>> welcome(){
		LinkedHashMap<String, Object> map=new LinkedHashMap<>();
		map.put("message", "sucess");
		map.put("result", "This is server  side welcome");
		map.put("time", LocalTime.now());
		return ResponseEntity.ok(map);
	}
	@GetMapping("/hello")
	
		public ResponseEntity<Map<String,Object>> hello() {
		Map<String,Object> map=new HashMap<>();
		map.put("message", "sucess");
		map.put("result" , "CICI configuration is working");
		map.put("time", LocalTime.now());
			return ResponseEntity.ok(map);
		}
	}

