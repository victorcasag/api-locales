package com.bighouse.api_locales.Error;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.concurrent.TimeoutException;

@RestControllerAdvice
public class RestExceptionHandler {

    // Erro de autenticação (401 Unauthorized)
    @ExceptionHandler(AuthenticationException.class)
    public ResponseEntity<ApiError> handleAuthenticationException(AuthenticationException ex) {
        ApiError apiError = new ApiError(HttpStatus.UNAUTHORIZED.value(), "Usuário não autenticado.");
        return new ResponseEntity<>(apiError, HttpStatus.UNAUTHORIZED);
    }

    // Erro de permissão negada (403 Forbidden)
    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<ApiError> handleAccessDeniedException(AccessDeniedException ex) {
        ApiError apiError = new ApiError(HttpStatus.FORBIDDEN.value(), "Acesso negado.");
        return new ResponseEntity<>(apiError, HttpStatus.FORBIDDEN);
    }

    // Erro interno do servidor (500 Internal Server Error)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleException(Exception ex) {
        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Erro interno do servidor.");
        return new ResponseEntity<>(apiError, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    // Timeout (504 Gateway Timeout)
    @ExceptionHandler(TimeoutException.class)
    public ResponseEntity<ApiError> handleTimeoutException(TimeoutException ex) {
        ApiError apiError = new ApiError(HttpStatus.GATEWAY_TIMEOUT.value(), "Tempo de resposta excedido.");
        return new ResponseEntity<>(apiError, HttpStatus.GATEWAY_TIMEOUT);
    }

    // Violação de integridade de dados (exemplo: duplicação de chave no banco)
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ApiError> handleDataIntegrityViolationException(DataIntegrityViolationException ex) {
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST.value(), "Violação de integridade de dados.");
        return new ResponseEntity<>(apiError, HttpStatus.BAD_REQUEST);
    }

    // Adicione apenas se essas exceções existirem no seu código
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiError> handleResourceNotFoundException(ResourceNotFoundException ex) {
        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ConflictException.class)
    public ResponseEntity<ApiError> handleConflictException(ConflictException ex) {
        ApiError apiError = new ApiError(HttpStatus.CONFLICT.value(), ex.getMessage());
        return new ResponseEntity<>(apiError, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(DependencyFailureException.class)
    public ResponseEntity<ApiError> handleDependencyFailureException(DependencyFailureException ex) {
        ApiError apiError = new ApiError(HttpStatus.FAILED_DEPENDENCY.value(), "Falha em dependência.");
        return new ResponseEntity<>(apiError, HttpStatus.FAILED_DEPENDENCY);
    }

    @ExceptionHandler(BadGatewayException.class)
    public ResponseEntity<ApiError> handleBadGatewayException(BadGatewayException ex) {
        ApiError apiError = new ApiError(HttpStatus.BAD_GATEWAY.value(), "Gateway inválido.");
        return new ResponseEntity<>(apiError, HttpStatus.BAD_GATEWAY);
    }
}
