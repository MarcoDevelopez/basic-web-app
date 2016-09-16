package tutorial.core.services.exceptions;

public class AccountDoesNotExistException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AccountDoesNotExistException() {
		super();
	}

	public AccountDoesNotExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AccountDoesNotExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccountDoesNotExistException(String message) {
		super(message);
	}

	public AccountDoesNotExistException(Throwable cause) {
		super(cause);
	}
	
}
