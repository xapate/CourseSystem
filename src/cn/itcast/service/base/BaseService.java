package cn.itcast.service.base;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.dao.impl.BaseDaoImpl;

@Transactional
@Service
public class BaseService<T> {
	
	@Autowired
	private BaseDaoImpl<T> baseDaoImpl;
	
	public T save(T t) {
		baseDaoImpl.save(t);
		return t;
	}
	
}
