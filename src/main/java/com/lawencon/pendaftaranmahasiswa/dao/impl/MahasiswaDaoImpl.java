package com.lawencon.pendaftaranmahasiswa.dao.impl;

import org.springframework.stereotype.Repository;

import com.lawencon.pendaftaranmahasiswa.dao.MahasiswaDao;
import com.lawencon.pendaftaranmahasiswa.model.Mahasiswa;

@Repository
public class MahasiswaDaoImpl extends BaseHibernate implements MahasiswaDao {

	@Override
	public void insertMhs(Mahasiswa mhs) throws Exception {
		em.persist(mhs);		
	}

	
}
