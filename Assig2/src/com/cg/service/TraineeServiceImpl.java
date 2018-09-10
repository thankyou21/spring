package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.TraineeDao;
import com.cg.entities.Trainee;

@Transactional
@Service
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeDao tdao;
	
	@Override
	public List<Trainee> getAllTrainee() {
		return tdao.getAllTrainee();
	}

	@Override
	public void insertTrainee(Trainee trainee) {
		tdao.insertTrainee(trainee);
	}

	@Override
	public void delTrainee(Integer tid) {
		tdao.delTrainee(tid);
	}

	@Override
	public Trainee searchTrainee(Integer tid) {
		return tdao.searchTrainee(tid);
		
	}

	@Override
	public void modifyTrainee(Trainee tdetails) {
		tdao.modifyTrainee(tdetails);
		
	}

}
