package com.sushanth.customexcpetions;

public class NameAlreadyExists extends RuntimeException{

	public NameAlreadyExists(String message) {
		super(message);
	}
	
}
