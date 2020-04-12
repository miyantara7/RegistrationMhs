package com.lawencon.pendaftaranmahasiswa.dao.impl;



import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lawencon.pendaftaranmahasiswa.dao.AdminDao;
import com.lawencon.pendaftaranmahasiswa.model.Mahasiswa;
import com.lawencon.pendaftaranmahasiswa.model.User;

@Repository
public class AdminDaoImpl extends BaseHibernate implements AdminDao {

	@Override
	public Mahasiswa searchMhs(int id) throws Exception {
		Query q = em.createQuery("from Mahasiswa where mahaId =: idParam and status = 'BELUM'")
				.setParameter("idParam", id);
		return (Mahasiswa) q.getSingleResult();
	}

	@Override
	public void acceptedMhs(Mahasiswa mhs) throws Exception {
		em.persist(mhs);	
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Mahasiswa> viewNotMhs() throws Exception {
		Query q = em.createQuery("from Mahasiswa where status = 'BELUM'");
		return (List<Mahasiswa>) q.getResultList();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Mahasiswa> viewAccMhs() throws Exception {
		Query q = em.createQuery("from Mahasiswa where status = 'ACCEPT'");
		return (List<Mahasiswa>) q.getResultList();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Mahasiswa> viewRejectMhs() throws Exception {
		Query q = em.createQuery("from Mahasiswa where status = 'REJECT'");
		return (List<Mahasiswa>) q.getResultList();
	}

	@Override
	public User findUser(User user) throws Exception {
		Query q = em.createQuery("from User where username =: uParam and password =: pParam")
				.setParameter("uParam", user.getUsername())
				.setParameter("pParam", user.getPassword());
		return (User) q.getSingleResult();
	}

}
