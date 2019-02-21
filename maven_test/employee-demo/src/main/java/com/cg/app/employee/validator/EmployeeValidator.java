package com.cg.app.employee.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.cg.app.employee.pojo.Employee;

@Component
public class EmployeeValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		Employee employee = (Employee)target;
		if(employee.getEmpName().length() < 2) {
			errors.rejectValue("empName","empname.length","Employee Name must have more than 2 characters");
		}
		if(employee.getSalary()<5000) {
			errors.rejectValue("salary","salary.minimum", "salary must be higher than 5000");
		}
		
	}

}
