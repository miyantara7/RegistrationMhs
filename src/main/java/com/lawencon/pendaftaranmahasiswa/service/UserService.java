package com.lawencon.pendaftaranmahasiswa.service;

import com.lawencon.pendaftaranmahasiswa.model.Mahasiswa;

public interface UserService {
	abstract String insertMhs(Mahasiswa mhs) throws Exception;
}
