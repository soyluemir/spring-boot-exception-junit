package com.emirhansoylu.handler;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiError<E>{
	
	private Integer status;  // HTTP status kodu (örn. 400)
	
	private Exception<E> exception; // Aşağıdaki detay nesnesi
	
}
