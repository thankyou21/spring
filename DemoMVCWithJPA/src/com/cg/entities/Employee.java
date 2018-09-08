package com.cg.entities;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column(name="EmpNo")
	@NotNull(message="EmpNo is mandatory")
	private Integer empno;
	
	@Column(name="EmpName")
	@NotEmpty(message="Name is mandatory")
	@Pattern(regexp="[A-Za-z]{3,15}", message="Name should contain min 3 and max 15 characters.")
	private String empName;
	
	@Column(name="Age")
	@NotNull(message="Age is mandatory")
	private Integer age;
	
	
	public Employee() {
		super();
	}
	
	
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empName=" + empName + ", age="
				+ age + "]";
	}
	
	
	

}
