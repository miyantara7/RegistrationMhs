package com.lawencon.pendaftaranmahasiswa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lawencon.pendaftaranmahasiswa.model.Mahasiswa;
import com.lawencon.pendaftaranmahasiswa.service.AdminService;

@RestController
@CrossOrigin("*")
@RequestMapping("/admins")
public class AdminController {

	@Autowired
	private AdminService a_service;
	
	@PostMapping("/accept")
	public ResponseEntity<?> accMhs(@RequestBody String content) {
		String pesan = "";
		try {
			Mahasiswa mhs = new ObjectMapper().readValue(content, Mahasiswa.class);
			pesan  = a_service.acceptMhs(mhs);
			return new ResponseEntity<>(pesan, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(pesan, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@PostMapping("/reject")
	public ResponseEntity<?> rejectMhs(@RequestBody String content) {
		String pesan = "";
		try {
			Mahasiswa mhs = new ObjectMapper().readValue(content, Mahasiswa.class);
			pesan  = a_service.rejectMhs(mhs);
			return new ResponseEntity<>(pesan, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(pesan, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping("/listacc")
	public ResponseEntity<?> listAcc() {
		List<Mahasiswa> listmhs = new ArrayList<>();
		try {
			listmhs  = a_service.viewAccMhs();
			return new ResponseEntity<>(listmhs, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(listmhs, HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@GetMapping("/list")
	public ResponseEntity<?> list() {
		List<Mahasiswa> listmhs = new ArrayList<>();
		try {
			listmhs  = a_service.viewNotMhs();
			return new ResponseEntity<>(listmhs, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(listmhs, HttpStatus.BAD_REQUEST);
		}
		
	}
	@GetMapping("/listreject")
	public ResponseEntity<?> listReject() {
		List<Mahasiswa> listmhs = new ArrayList<>();
		try {
			listmhs  = a_service.viewRejectMhs();
			return new ResponseEntity<>(listmhs, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(listmhs, HttpStatus.BAD_REQUEST);
		}
		
	}

}
