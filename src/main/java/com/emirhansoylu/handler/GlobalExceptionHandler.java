package com.emirhansoylu.handler;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.emirhansoylu.exception.BaseException;

@ControllerAdvice // tüm exceptionları yakalayan sınıftır diyoruz anatasyonla
public class GlobalExceptionHandler {

	// baseexceptionlar maplendi bu metoda girdi hatam

	@ExceptionHandler(value = { BaseException.class }) // baseexceptionu yakaladım ve parametre olarak geçtim
	public ResponseEntity<ApiError> handleBaseException(BaseException exception, WebRequest request) {

		return ResponseEntity.badRequest().body(createApiError(exception.getMessage(), request));

	}
	public <E> ApiError<E> createApiError(E message, WebRequest request) {

		ApiError<E> apiError = new ApiError<>();
		apiError.setStatus(HttpStatus.BAD_REQUEST.value()); //400 dön diyoruz bu hata olursa

		Exception<E> exception = new Exception<>();
		exception.setCreateTime(new Date());
		exception.setHostName(getHostname());
		exception.setPath(request.getDescription(false).substring(4)); // istek attığımız url adresini alıp dönüyor
		exception.setMessage(message);

		apiError.setException(exception);

		return apiError;
	}

	private String getHostname() {
		try {
			return InetAddress.getLocalHost().getHostName(); //uygulamanın çalıştığı makine adını verir
		} catch (UnknownHostException e) {
			System.out.println("logda hata oluştu" + e.getMessage());
		}
		return null;
	}

	

}
