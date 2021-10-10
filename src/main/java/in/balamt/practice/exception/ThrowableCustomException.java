package in.balamt.practice.exception;

public class ThrowableCustomException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ThrowableCustomException() {
		super();
	}
	
	public ThrowableCustomException(String message) {
		super(message);
	}

}
