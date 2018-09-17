package com.cg.lms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.lms.dao.LMSDao;
import com.cg.lms.entities.Employee_leave_details;


@Transactional
@Service
public class LMSService {
	
	@Autowired
	LMSDao ldao;

	public List<Employee_leave_details> getLeaves(int eid) {
		return ldao.getLeaves(eid);
	}
}
