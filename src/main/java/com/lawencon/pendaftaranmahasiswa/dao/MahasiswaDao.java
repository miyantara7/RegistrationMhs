package com.lawencon.pendaftaranmahasiswa.dao;

import com.lawencon.pendaftaranmahasiswa.model.Mahasiswa;

public interface MahasiswaDao {
	
	abstract void insertMhs(Mahasiswa mhs) throws Exception;
}
