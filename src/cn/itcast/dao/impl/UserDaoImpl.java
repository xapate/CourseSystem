package cn.itcast.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.itcast.dao.UserDao;
@Repository
public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;
	@Autowired
	private Session getSessionFactory() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Object object) {
		String sql="insert into student (sno,sname,spassword,sclass) value(?,?,?,?)";

	}

	@Override
	public void add(Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public List findall(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}
