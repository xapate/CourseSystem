package cn.itcast.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.itcast.dao.base.BaseDao;

@Repository
public class BaseDaoImpl<T> implements BaseDao<T> {
	
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public T save(T t) {
		getSession().save(t);
		return t;
	}

	public void delete(T t) {
		getSession().delete(t);
	}
}
