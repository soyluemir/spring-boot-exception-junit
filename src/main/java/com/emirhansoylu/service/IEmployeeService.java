package com.emirhansoylu.service;

import com.emirhansoylu.dto.DtoEmployee;

public interface IEmployeeService {
	
	public DtoEmployee findEmployeeById(Long id);

}
