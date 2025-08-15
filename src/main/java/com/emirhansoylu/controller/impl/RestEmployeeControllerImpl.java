package com.emirhansoylu.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emirhansoylu.controller.RestEmployeeController;
import com.emirhansoylu.dto.DtoEmployee;
import com.emirhansoylu.model.RootEntity;
import com.emirhansoylu.service.IEmployeeService;

@RestController
@RequestMapping("rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/list/{id}")
	@Override
	public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(name  = "id") Long id) {
		return ok(employeeService.findEmployeeById(id)); //ok metoduna git diyoruz miras almıştık
	}

}
