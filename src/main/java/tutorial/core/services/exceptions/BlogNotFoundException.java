package tutorial.core.services.exceptions;

public class BlogNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BlogNotFoundException() {
		super();
	}

	public BlogNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public BlogNotFoundException(String message) {
		super(message);
	}

}
