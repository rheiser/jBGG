package org.kerf.bgg.exception;

@SuppressWarnings("serial")
public class CommandExecutionException extends Exception {

	public CommandExecutionException() {
		super();
	}
	
	public CommandExecutionException(String message) {
	   super(message);
	}
	
	public CommandExecutionException(String message, Exception e) {
		super(message, e);
	}

}
