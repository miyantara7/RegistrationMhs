package com.lawencon.pendaftaranmahasiswa.service;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawencon.pendaftaranmahasiswa.dao.MahasiswaDao;
import com.lawencon.pendaftaranmahasiswa.model.Mahasiswa;
import com.lawencon.pendaftaranmahasiswa.model.Status;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private MahasiswaDao m_dao;
	@Autowired
	private EmailService e_service;
	
	@Override
	public String insertMhs(Mahasiswa mhs) throws Exception {
		mhs.setStatus(Status.BELUM.name());
		m_dao.insertMhs(mhs);
		e_service.sendEmails(mhs);
		return "Completed";
	}
}
