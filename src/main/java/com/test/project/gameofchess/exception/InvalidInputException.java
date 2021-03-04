package com.test.project.gameofchess.exception;
/**
 * Indicates invalid input
 * @author apte
 *
 */
public class InvalidInputException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9059831408034690592L;
	
	public final static String INVALID_INPUT_EXCEPTION = "Invalid input!!";
	public final static String UNSUPPOERTED_INPUT_EXCEPTION = "Unsupported input!!";
	
	public InvalidInputException(String str) {
		super(str);
	}
	
	public InvalidInputException() {
		super(INVALID_INPUT_EXCEPTION);
	}
}
