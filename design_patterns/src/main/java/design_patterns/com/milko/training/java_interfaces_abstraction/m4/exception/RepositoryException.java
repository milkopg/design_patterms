package design_patterns.com.milko.training.java_interfaces_abstraction.m4.exception;

public class RepositoryException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7536722213483500447L;

	public RepositoryException(final String message, final Throwable cause) {
		super(message, cause);
	}
}
