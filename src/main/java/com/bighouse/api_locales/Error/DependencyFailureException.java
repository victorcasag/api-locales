package com.bighouse.api_locales.Error;

public class DependencyFailureException extends RuntimeException {
    public DependencyFailureException(String message) {
        super(message);
    }
}
