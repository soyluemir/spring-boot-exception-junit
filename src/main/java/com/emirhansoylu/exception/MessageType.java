package com.emirhansoylu.exception;

import lombok.Getter;

@Getter
public enum MessageType {
	
	NO_RECORD_EXIST("1001","Kayıt bulunamadı"),  //hata mesajı kodu 1001   
	GENERAL_EXCEPTIPON("9999", "Genel bir hata oluştu");  //bunlar tip tanımlamaları
	
	private String code;   
	
	private String message;
					//birinci parametresi koda denk geliyor ikinci parametre hata mesajına
	private MessageType(String code, String message) {
		
		this.code =code;   // gelen parametreyi enum değişkenine atar
		
		this.message = message; // gelen mesajı enum değişkenine atar
	}
	  // yukarıdaki hata mesajındaki değerleri constructora geçiyor onları da tanımlamış olduğum değişkenlere setliyor
	 // 1001 değerim String code OLAN PARAMETREYE EŞLENİYOR // KAYIT BULUNAMADI İSE STRİNG MESSAGE OLAN PARAMETREYE GEÇİYOR
      // PARAMETREYE GELEN 2 DEĞERİ TANIMLADIĞIM 2 DEĞİŞKENE VERİYORUM
}
