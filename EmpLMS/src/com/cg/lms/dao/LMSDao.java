package com.cg.lms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.lms.entities.Employee_leave_details;


@Repository
public class LMSDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<Employee_leave_details> getLeaves(int eid) {
		String jpql = "Select e from Employee_leave_details e Where e.empid=:eId";
		TypedQuery<Employee_leave_details> query = em.createQuery(jpql, Employee_leave_details.class);
		query.setParameter("eId", eid);
		return query.getResultList();
		
	}
	
}
