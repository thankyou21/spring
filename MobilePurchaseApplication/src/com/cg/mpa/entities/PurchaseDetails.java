package com.cg.mpa.entities;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.*;


@Entity
@Table(name="purchasedetails")
public class PurchaseDetails {
	
	@Id
	@Column(name="PURCHASEID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@SequenceGenerator(name="seq", sequenceName="purchaseid", allocationSize=1)
	private Integer purchaseId;

	@Column(name="CNAME")
	@NotEmpty(message="Name is mandatory")
	@Pattern(regexp="[A-Za-z]{3,15}", message="Name should contain min 3 and max 15 characters.")
	private String custName;
	
	@Column(name="PHONENO")
	@NotEmpty(message="Phone No is required")
	@Pattern(regexp="[0-9]{10}", message="Phone no should contain 10 digits")
	private String phoneNo;
	
	
	@Column(name="mailid")
	@Email(message="Enter a valid mail id")
	private String emailId;
	
	@Column(name="PURCHASEDATE")
	@Pattern(regexp="[0-9]{2}-[A-Za-z]{3}-[0-9]{4}",message="Date must be in DD-MMM-YYYY format")
	private String purchaseDate;
	
	@Column(name="mobileid")
	private Integer mobileid;  //if yits not user input don't put any validation.

	public Integer getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Integer getMobileid() {
		return mobileid;
	}

	public void setMobileid(Integer mobileid) {
		this.mobileid = mobileid;
	}

	@Override
	public String toString() {
		return "PurchaseDetails [purchaseId=" + purchaseId + ", custName="
				+ custName + ", phoneNo=" + phoneNo + ", emailId=" + emailId
				+ ", purchaseDate=" + purchaseDate + ", mobileid=" + mobileid
				+ "]";
	}

	public PurchaseDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
