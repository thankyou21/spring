 package com.cg.entities;

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
@Table(name="Trainee")
public class Trainee {
	
	@Id
	@Column(name="TraineeId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@SequenceGenerator(name="seq", sequenceName="TraineeId", allocationSize=1)
	private Integer TraineeId;

	@Column(name="TraineeName")
	@NotEmpty(message="Name is mandatory")
	@Pattern(regexp="[A-Za-z]{3,15}", message="Name should contain min 3 and max 15 characters.")
	private String TraineeName;
	
	@Column(name="TraineeLocation")
	@NotEmpty(message="Location is mandatory")
	private String TraineeLocation;
	
	
	@Column(name="TraineeDomain")
	@NotEmpty(message="Domain is mandatory")
	private String TraineeDomain;




	public Integer getTraineeId() {
		return TraineeId;
	}




	public void setTraineeId(Integer traineeId) {
		TraineeId = traineeId;
	}




	public String getTraineeName() {
		return TraineeName;
	}




	public void setTraineeName(String traineeName) {
		TraineeName = traineeName;
	}




	public String getTraineeLocation() {
		return TraineeLocation;
	}




	public void setTraineeLocation(String traineeLocation) {
		TraineeLocation = traineeLocation;
	}




	public String getTraineeDomain() {
		return TraineeDomain;
	}




	public void setTraineeDomain(String traineeDomain) {
		TraineeDomain = traineeDomain;
	}




	@Override
	public String toString() {
		return "Trainee [TraineeId=" + TraineeId + ", TraineeName="
				+ TraineeName + ", TraineeLocation=" + TraineeLocation
				+ ", TraineeDomain=" + TraineeDomain + "]";
	}


	
}
