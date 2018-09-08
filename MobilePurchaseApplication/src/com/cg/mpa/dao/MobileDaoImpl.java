package com.cg.mpa.dao;

import java.util.List;

import javax.persistence.*;

import org.springframework.stereotype.Repository;

import com.cg.mpa.entities.*;

@Repository
public class MobileDaoImpl implements MobileDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Mobile> fetchAllMobiles() {
		String jpql = "Select m from Mobile m";
		TypedQuery<Mobile> query = em.createQuery(jpql, Mobile.class);
		return query.getResultList();
	}

}
