package com.cg.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.EmployeeDao;
import com.cg.entities.Employee;

@Service("eser")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao edao;
	
	@Override
	public int insertEmp(Employee emp) {
		edao.save(emp);
		return emp.getEmpno();
	}

}
