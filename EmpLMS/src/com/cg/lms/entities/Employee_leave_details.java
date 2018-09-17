package com.cg.lms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="employee_leave_details")
public class Employee_leave_details {
	
	@Id
	@Column(name="leave_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@SequenceGenerator(name="seq", sequenceName="leave_id", allocationSize=1)
	Integer leave_id;
	
	@Column(name="empid")
	@NotEmpty(message="Cannot be empty")
	@Pattern(regexp="[0-9]", message="Please enter numeric value")
	Integer empid;
	
	@Column(name="start_date")
	@Pattern(regexp="[0-9]{2}-[A-Za-z]{3}-[0-9]{4}",message="Date must be in DD-MMM-YYYY format")
	String start_date;
	
	@Column(name="end_date")
	@Pattern(regexp="[0-9]{2}-[A-Za-z]{3}-[0-9]{4}",message="Date must be in DD-MMM-YYYY format")
	String end_date;
	
	@Column(name="description")
	@NotEmpty(message="description is required")
	String description;
	
	@Column(name="leaves_applied")
	@NotEmpty(message="Cannot be empty")
	@Pattern(regexp="[0-9]", message="Please enter numeric value")
	Integer leaves_applied;

	public Integer getLeave_id() {
		return leave_id;
	}

	public void setLeave_id(Integer leave_id) {
		this.leave_id = leave_id;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	public Integer getLeaves_applied() {
		return leaves_applied;
	}

	public void setLeaves_applied(Integer leaves_applied) {
		this.leaves_applied = leaves_applied;
	}

	@Override
	public String toString() {
		return "Employee_leave_details [leave_id=" + leave_id + ", empid="
				+ empid + ", start_date=" + start_date + ", end_date="
				+ end_date + ", description=" + description + ", leaves_applied="
				+ leaves_applied + "]";
	}

	public Employee_leave_details(Integer leave_id, Integer empid,
			String start_date, String end_date, String description,
			Integer leaves_applied) {
		super();
		this.leave_id = leave_id;
		this.empid = empid;
		this.start_date = start_date;
		this.end_date = end_date;
		this.description = description;
		this.leaves_applied = leaves_applied;
	}

	public Employee_leave_details() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
