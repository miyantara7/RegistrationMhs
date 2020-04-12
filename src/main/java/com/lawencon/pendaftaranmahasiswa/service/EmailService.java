package com.lawencon.pendaftaranmahasiswa.service;

import com.lawencon.pendaftaranmahasiswa.model.Mahasiswa;

public interface EmailService {

	abstract void sendEmails(Mahasiswa mhs) throws Exception;
}
