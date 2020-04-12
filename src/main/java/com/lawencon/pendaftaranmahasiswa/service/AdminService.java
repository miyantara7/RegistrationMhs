package com.lawencon.pendaftaranmahasiswa.service;

import java.util.List;

import com.lawencon.pendaftaranmahasiswa.model.Mahasiswa;
import com.lawencon.pendaftaranmahasiswa.model.User;

public interface AdminService {

	abstract String acceptMhs(Mahasiswa mhs) throws Exception;
	abstract String rejectMhs(Mahasiswa mhs) throws Exception;
	abstract User findUser(User users) throws Exception;
	abstract List<Mahasiswa> viewNotMhs() throws Exception;
	abstract List<Mahasiswa> viewAccMhs() throws Exception;
	abstract List<Mahasiswa> viewRejectMhs() throws Exception;
}
