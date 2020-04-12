package com.lawencon.pendaftaranmahasiswa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lawencon.pendaftaranmahasiswa.model.Mahasiswa;
import com.lawencon.pendaftaranmahasiswa.service.UserService;

@RestController
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService u_service;
	
	@PostMapping("/insert")
	public ResponseEntity<?> insertCovid(@RequestBody String content) {
		String pesan = "";
		try {
			Mahasiswa mhs = new ObjectMapper().readValue(content, Mahasiswa.class);
			pesan  = u_service.insertMhs(mhs);
			return new ResponseEntity<>(pesan, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(pesan, HttpStatus.BAD_REQUEST);
		}
		
	}
}
