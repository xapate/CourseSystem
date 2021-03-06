package cn.itcast.entity;
// Generated 2017-6-13 23:52:06 by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Student generated by hbm2java
 */
@Entity
@Table(name = "student", catalog = "coursesystem")
public class Student implements java.io.Serializable {

	private int sno;
	private String sname;
	private String spassword;
	private String sclass;

	public Student() {
	}

	public Student(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}

	public Student(int sno, String sname, String spassword, String sclass) {
		this.sno = sno;
		this.sname = sname;
		this.spassword = spassword;
		this.sclass = sclass;
	}

	@Id

	@Column(name = "sno", unique = true, nullable = false)
	public int getSno() {
		return this.sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	@Column(name = "sname", nullable = false, length = 20)
	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Column(name = "spassword", length = 20)
	public String getSpassword() {
		return this.spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	@Column(name = "sclass", length = 20)
	public String getSclass() {
		return this.sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

}
