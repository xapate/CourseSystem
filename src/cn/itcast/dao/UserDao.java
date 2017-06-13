package cn.itcast.dao;

import org.springframework.stereotype.Repository;

import cn.itcast.dao.impl.BaseDaoImpl;
import cn.itcast.entity.Student;

@Repository
public class UserDao extends BaseDaoImpl<Student> {

}
