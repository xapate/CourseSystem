package cn.itcast.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.entity.Student;
import cn.itcast.service.impl.UserServiceImpl;

@Namespace("/")
@Action("register")  
public class RegisterAction extends ActionSupport {
	
	@Autowired
	private UserServiceImpl userService;
	
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public String reg() {
		
		System.out.println("执行成功");
		System.out.println(student.getSno());
		Student existstudent= userService.save(student);
		System.out.println(existstudent);
		if(existstudent!=null)
		{
			System.out.println("注册成功");
		}
		return SUCCESS;
	}
}
