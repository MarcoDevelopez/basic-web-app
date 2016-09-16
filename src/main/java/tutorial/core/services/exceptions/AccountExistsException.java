package tutorial.core.services.exceptions;

public class AccountExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AccountExistsException() {
		super();
	}

	public AccountExistsException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccountExistsException(String message) {
		super(message);
	}

}
