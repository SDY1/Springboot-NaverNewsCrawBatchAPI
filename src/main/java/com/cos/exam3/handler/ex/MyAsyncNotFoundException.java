package com.cos.exam3.handler.ex;
// /** + enter
/**
 * 
 * @author SDY 2021.09.28
 * 1. id를 못찾았을 때 사용
 *
 */
public class MyAsyncNotFoundException extends RuntimeException{
	
	public MyAsyncNotFoundException(String msg) {
		super(msg);
	}

}
