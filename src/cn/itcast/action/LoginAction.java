package cn.itcast.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator.Success;

import cn.itcast.entity.Student;
import cn.itcast.service.impl.UserServiceImpl;

@Namespace("/")
@Action(value="login", results={@Result(name="success",location="/index.jsp"),@Result(name="error",location="/login.jsp")})  
public class LoginAction extends ActionSupport {
	@Autowired
	private UserServiceImpl userService;
	private Student student;

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
	
	public String log(){
		ActionContext actionContext=ActionContext.getContext();
		System.out.println("ssss");
		System.out.println(student.getSno());
		Student st=userService.login(student.getSno(), student.getSpassword());
		System.out.println(st);
		if(st!=null) {
			System.out.println("登录成功");
			actionContext.getSession().put("loginmsg", "登录成功");
			return SUCCESS;
		}
		return ERROR;
	}
}
