package com.emirhansoylu.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
	
	private String ofStatic; //elle vereceğimiz kullanıcı değer
	private MessageType messageType; //enumumuz burada
	
	
	public String prepareErrorMessage() { //error mesajımı hazırla metodu
		StringBuilder builder = new StringBuilder();
		builder.append(messageType.getMessage()); //mesajı ekliyor buildere //append birleştirmeye yarıyor
		if (ofStatic!=null) { // 
			builder.append(":"+ ofStatic);
			
		}
		return builder.toString(); //mesajı ve  kullanıcı değerini dön
		
		
		
	}


	
}
