package com.lawencon.pendaftaranmahasiswa.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

abstract class BaseHibernate {

	@PersistenceContext
	protected EntityManager em;
}
