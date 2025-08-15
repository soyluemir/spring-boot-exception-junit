package com.emirhansoylu.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RootEntity<T> {
	
	private boolean result;
	
	private String errorMessage;
	
	private T data;
	    // başarılı döndürme
	public static <T> RootEntity<T>  ok(T data){ //metodu çağırırsam T tipinde data ver dışarıdan
		RootEntity<T> rootEntity = new RootEntity<>();
		rootEntity.setData(data);  //parametre olarak gelen data
		rootEntity.setResult(true);
		rootEntity.setErrorMessage(null);
		return rootEntity;
	}

	public static <T> RootEntity<T> error(String errorMessage){  //hatalı döndürme
		RootEntity<T> rootEntity = new RootEntity<>();
		rootEntity.setData(null);
		rootEntity.setErrorMessage(errorMessage);               //static tanımladım sınıf ismiyle erişebilirim.
		rootEntity.setResult(false);
	
		return rootEntity;
		
	}
}
