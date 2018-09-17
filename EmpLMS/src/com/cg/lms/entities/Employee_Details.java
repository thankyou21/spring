package com.cg.lms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="employee_details")
public class Employee_Details {
	@Id
	@Column(name="empid")
	Integer empid;
	
	@Column(name="ename")
	@NotEmpty(message="Name is mandatory")
	@Pattern(regexp="[A-Za-z]{3,15}", message="Name should contain min 3 and max 15 characters.")
	String ename;
	
	@Column(name="address")
	@NotEmpty(message="Address is required")
	String address;
	
	@Column(name="leaves_avail")
	@NotEmpty(message="Cannot be empty")
	@Pattern(regexp="[0-9]", message="Please enter numeric value")
	Integer leaves_avail;

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getLeaves_avail() {
		return leaves_avail;
	}

	public void setLeaves_avail(Integer leaves_avail) {
		this.leaves_avail = leaves_avail;
	}

	@Override
	public String toString() {
		return "Employee_Details [empid=" + empid + ", ename=" + ename
				+ ", address=" + address + ", leaves_avail=" + leaves_avail
				+ "]";
	}

	public Employee_Details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee_Details(Integer empid, String ename, String address,
			Integer leaves_avail) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.address = address;
		this.leaves_avail = leaves_avail;
	}
	
	
}
