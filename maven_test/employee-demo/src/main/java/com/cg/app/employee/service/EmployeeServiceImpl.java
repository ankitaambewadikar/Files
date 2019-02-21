package com.cg.app.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.employee.dao.EmployeeDAO;
import com.cg.app.employee.pojo.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {


	@Autowired
	private EmployeeDAO employeeDao;
	
	
	@Override
	public Employee addNewEmployee(Employee employee) {
		employeeDao.addNewEmployee(employee);
		return employee;
		
	}
}
