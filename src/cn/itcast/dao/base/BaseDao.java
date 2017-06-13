package cn.itcast.dao.base;

public interface BaseDao<T> {
	
	T save(T t);
	
	
	void delete(T t);
}
