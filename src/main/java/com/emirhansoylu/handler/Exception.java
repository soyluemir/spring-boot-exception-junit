package com.emirhansoylu.handler;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Exception<E> { //e tipinde veri geliyor
	 
	private String hostName; // hatayı üreten makine adı
	
	private String path; // hangi endpoint’te oldu
	 
	private Date createTime;   // hata zamanı
	
	
	private E message; //E tipindeki messageyi al   // asıl içerik (String veya ErrorMessage vb.)

}
