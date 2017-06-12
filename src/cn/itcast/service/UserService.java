package cn.itcast.service;

import java.util.List;

public interface UserService {
	public void save(Object object);
	public void add(Object object);
	public void delete(Object object);
	public void update(Object object);
	public List findall(Object object);

}
