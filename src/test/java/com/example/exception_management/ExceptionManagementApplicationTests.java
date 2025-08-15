package com.example.exception_management;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.emirhansoylu.dto.DtoEmployee;
import com.emirhansoylu.service.IEmployeeService;
import com.emirhansoylu.starter.ExceptionManagementStarter;

@SpringBootTest(classes = {ExceptionManagementStarter.class})
class ExceptionManagementApplicationTests {
	//junit direkt servere bağlanıyor controllere istek atmıyoruz
	
	@Autowired
	private IEmployeeService employeeService;

	@BeforeEach   //test medoundan önce çalışır
	public void beforeEach() {
		System.out.println("beforeeach çalıştı");
		
	}

	
	@Test
	public void testFindEmployeeById() {
		DtoEmployee employee = employeeService.findEmployeeById(2L);
	//	assertNotNull(employee); BOŞ MU KONTROLU YAPIYORUZ
	//	assertEquals(2, employee.getId()); senden 2 bekliyorum 2 dönersen başarılı id olarak
		if (employee!=null) {
			System.out.println("isim"+ employee.getName());
			
		}
		
	}
	
	@AfterEach//test metodundan sonra çalışır
	public void afterEach() {
		System.out.println("aftereach çalıştı");
		
	}

	

}
