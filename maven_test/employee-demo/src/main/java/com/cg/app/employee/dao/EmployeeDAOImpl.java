package com.cg.app.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cg.app.employee.dao.sql.SQLQueries;
import com.cg.app.employee.pojo.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public Employee addNewEmployee(Employee employee) {
		template.update(SQLQueries.getInstance().insertQuery(),new Object[] {employee.getEmpId(),employee.getEmpName(),employee.getSalary()
				
		});
		return employee;
		
	}
	
}
