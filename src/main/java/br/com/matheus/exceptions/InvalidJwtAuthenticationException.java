package br.com.matheus.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.naming.AuthenticationException;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class InvalidJwtAuthenticationException extends AuthenticationException {
    private static final long serialVersionUID = 1L;

    public InvalidJwtAuthenticationException() {
        super("It is not allowed to persist a null object!");
    }
    public InvalidJwtAuthenticationException(String ex) {
        super(ex);
    }

}
