package com.lawencon.pendaftaranmahasiswa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawencon.pendaftaranmahasiswa.dao.AdminDao;
import com.lawencon.pendaftaranmahasiswa.model.Mahasiswa;
import com.lawencon.pendaftaranmahasiswa.model.Status;
import com.lawencon.pendaftaranmahasiswa.model.User;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminDao a_dao;
	@Autowired
	private EmailService e_service;
	
	@Override
	public String acceptMhs(Mahasiswa mhs) throws Exception {
		Mahasiswa mhs2 = new Mahasiswa();
		try {
			mhs2 = a_dao.searchMhs(mhs.getMahaId());
		} catch (Exception e) {}
		if(mhs2!=null) {
			mhs2.setStatus(Status.ACCEPT.name());
			a_dao.acceptedMhs(mhs2);
			e_service.sendEmails(mhs2);
			return "Completed !";
		}else {
			return "Error data is not Found !";
		}		
	}

	@Override
	public String rejectMhs(Mahasiswa mhs) throws Exception {
		Mahasiswa mhs2 = new Mahasiswa();
		try {
			mhs2 = a_dao.searchMhs(mhs.getMahaId());
		} catch (Exception e) {}
		if(mhs2!=null) {
			mhs2.setStatus(Status.REJECT.name());
			a_dao.acceptedMhs(mhs2);
			e_service.sendEmails(mhs2);
			return "Completed !";
		}else {
			return "Error data is not Found !";
		}	
	}

	@Override
	public User findUser(User users) throws Exception {
		User user2 = new User();
		try {
			user2 = a_dao.findUser(users);
		} catch (Exception e) {}
		if(user2!=null) {	
			return user2;
		}else {
			return null;
		}
		
	}

	@Override
	public List<Mahasiswa> viewNotMhs() throws Exception {
		return a_dao.viewNotMhs();
	}

	@Override
	public List<Mahasiswa> viewAccMhs() throws Exception {
		return a_dao.viewAccMhs();
	}

	@Override
	public List<Mahasiswa> viewRejectMhs() throws Exception {
		return a_dao.viewRejectMhs();
	}

	

}
