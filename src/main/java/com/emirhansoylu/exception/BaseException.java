package com.emirhansoylu.exception;

public class BaseException extends RuntimeException{  //böylexe exception sınıfı yaptık throw ile fırlatabilirim yani
	
	public BaseException() {
		 //hem parametreli hme paramtreisiz constructoru var
	}
	
public BaseException(ErrorMessage errorMessage) { //dışarıdan errormessage alacaksın
	super(errorMessage.prepareErrorMessage());//bu metota git hata mesajını hazırla ve runtimexceptionun basesine yolla super ile
		
	}


}
