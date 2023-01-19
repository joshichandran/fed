package com.simulator.fed.exception;

import lombok.Getter;

@Getter
public class ApplicationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private int code;

	public ApplicationException(String message, int code) {
		super(message);
		this.code = code;
	}

}
