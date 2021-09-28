package com.cos.exam3.handler.ex;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.exam3.web.dto.CMRespDto;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = MyAsyncNotFoundException.class)
	public @ResponseBody CMRespDto<String> error1(MyAsyncNotFoundException e) {
		return new CMRespDto<String>(-1, e.getMessage(), null); 
	}
}
