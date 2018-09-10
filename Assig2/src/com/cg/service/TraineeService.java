package com.cg.service;

import java.util.List;

import com.cg.entities.Trainee;

public interface TraineeService {
	List<Trainee> getAllTrainee();
	void insertTrainee(Trainee trainee);
	void delTrainee(Integer tid);
	Trainee searchTrainee(Integer tid);
	void modifyTrainee(Trainee tdetails);
}
