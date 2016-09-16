package tutorial.core.services.exceptions;

public class BlogExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BlogExistsException() {
		super();
	}

	public BlogExistsException(String message, Throwable cause) {
		super(message, cause);
	}

	public BlogExistsException(String message) {
		super(message);
	}

	public BlogExistsException(Throwable cause) {
		super(cause);
	}

}
