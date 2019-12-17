package design_patterns.com.milko.training.java_interfaces_abstraction.m3.exception;

public class RepositoryException extends RuntimeException
{
    public RepositoryException(final String message, final Throwable cause)
    {
        super(message, cause);
    }
}
