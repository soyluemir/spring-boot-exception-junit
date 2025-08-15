package com.emirhansoylu.controller;

import com.emirhansoylu.dto.DtoEmployee;
import com.emirhansoylu.model.RootEntity;

public interface RestEmployeeController {
	
	public RootEntity<DtoEmployee> findEmployeeById(Long id);

}
