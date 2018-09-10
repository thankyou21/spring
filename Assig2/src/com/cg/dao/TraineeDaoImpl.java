package com.cg.dao;

import java.util.List;

import javax.persistence.*;

import org.springframework.stereotype.Repository;

import com.cg.entities.Trainee;

@Repository
public class TraineeDaoImpl implements TraineeDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void insertTrainee(Trainee trainee) {
		em.persist(trainee);
	}

	@Override
	public List<Trainee> getAllTrainee() {
		String jpql = "Select t from Trainee t";
		TypedQuery<Trainee> query = em.createQuery(jpql, Trainee.class);
		return query.getResultList();
		
	}

	@Override
	public void delTrainee(Integer tid) {
		Trainee removeTrainee = em.find(Trainee.class, tid);
		em.remove(removeTrainee);
		
	}

	@Override
	public Trainee searchTrainee(Integer tid) {
		Trainee search = em.find(Trainee.class, tid);
		return search;
		
	}

	@Override
	public void modifyTrainee(Trainee tdetails) {
		em.merge(tdetails);
		
	}

}
