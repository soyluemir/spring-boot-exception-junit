package com.emirhansoylu.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emirhansoylu.dto.DtoDepartment;
import com.emirhansoylu.dto.DtoEmployee;
import com.emirhansoylu.exception.BaseException;
import com.emirhansoylu.exception.ErrorMessage;
import com.emirhansoylu.exception.MessageType;
import com.emirhansoylu.model.Department;
import com.emirhansoylu.model.Employee;
import com.emirhansoylu.repository.EmployeeRepository;
import com.emirhansoylu.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public DtoEmployee findEmployeeById(Long id) {
		
		DtoEmployee dtoEmployee = new DtoEmployee();
		DtoDepartment dtoDepartment = new DtoDepartment();
		
	Optional<Employee> optional =	employeeRepository.findById(id);
	
	if (optional.isEmpty()) {
         throw new BaseException(new ErrorMessage(id.toString(), MessageType.NO_RECORD_EXIST));

	}
	  Employee employee = optional.get();
	  Department department = employee.getDepartment();
	  
	  BeanUtils.copyProperties(employee, dtoEmployee);
	  BeanUtils.copyProperties(department, dtoDepartment);
	   
	  dtoEmployee.setDepartment(dtoDepartment);  //iki tane kopyaladığımı birleştiriyorum  
	
		return dtoEmployee;
	}

}
