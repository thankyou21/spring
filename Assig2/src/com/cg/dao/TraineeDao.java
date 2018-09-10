package com.cg.dao;

import java.util.List;

import com.cg.entities.Trainee;


public interface TraineeDao {
	List<Trainee> getAllTrainee();
	void insertTrainee(Trainee trainee);
	void delTrainee(Integer tid);
	Trainee searchTrainee(Integer tid);
	void modifyTrainee(Trainee tdetails);
}
