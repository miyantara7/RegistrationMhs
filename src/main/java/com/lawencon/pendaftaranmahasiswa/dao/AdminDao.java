package com.lawencon.pendaftaranmahasiswa.dao;

import java.util.List;

import com.lawencon.pendaftaranmahasiswa.model.Mahasiswa;
import com.lawencon.pendaftaranmahasiswa.model.User;

public interface AdminDao {
	
	abstract Mahasiswa searchMhs(int id) throws Exception;
	abstract void acceptedMhs(Mahasiswa mhs) throws Exception;
	abstract List<Mahasiswa> viewNotMhs() throws Exception;
	abstract List<Mahasiswa> viewAccMhs() throws Exception;
	abstract List<Mahasiswa> viewRejectMhs() throws Exception;
	abstract User findUser(User user) throws Exception; 
}
