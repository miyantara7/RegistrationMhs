package com.lawencon.pendaftaranmahasiswa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.lawencon.pendaftaranmahasiswa.model.User;
import com.lawencon.pendaftaranmahasiswa.service.AdminService;

@RestController
@CrossOrigin("*")
public class LoginController extends BaseController<User> {

	@Autowired
	private AdminService a_service;

	@PostMapping("/login")
	public ResponseEntity<?> rejectMhs(@RequestBody String content) {
		User users = new User();
		try {
			User user = readValue(content, User.class);
			users = a_service.findUser(user);
			return new ResponseEntity<>(users, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(users, HttpStatus.BAD_REQUEST);
		}

	}
}
