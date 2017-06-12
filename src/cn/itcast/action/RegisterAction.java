package cn.itcast.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.dao.UserDao;
import cn.itcast.entity.Student;

public class RegisterAction extends ActionSupport {
	private Student student;
	private UserDao userDao;

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

	/**
	 * @return the userDao
	 */
	public UserDao getUserDao() {
		return userDao;
	}

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//Student student=new Student();
		//student.setSno(student.getSno());
		System.out.println(student.getSno());
		//student.setSname(student.getSname());
		//student.setSclass(student.getSclass());
		//student.setSpassword(student.getSpassword());
		//userDao.save(student);
		return SUCCESS;
	}
	

}
