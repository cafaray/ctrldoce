package com.ftc.ctrldoce.exception;

public class CtrlDoceException extends Exception {

	private static final long serialVersionUID = 1L;

	public CtrlDoceException() {}

	public CtrlDoceException(String message) {
		super(message);
	}

	public CtrlDoceException(Throwable cause) {
		super(cause);
	}

	public CtrlDoceException(String message, Throwable cause) {
		super(message, cause);
	}

	public CtrlDoceException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
