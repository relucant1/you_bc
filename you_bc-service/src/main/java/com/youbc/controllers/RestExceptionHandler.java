package com.youbc.controllers;

import com.youbc.exceptions.YouBCError;
import com.youbc.exceptions.YouBCException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice("com.youbc")
@RequestMapping(produces = "application/vnd.error+json")
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestExceptionHandler.class);

    public RestExceptionHandler() {
        super();
    }

    @ExceptionHandler({YouBCException.class})
    public ResponseEntity<YouBCError> handleYouBCException(YouBCException ex) {
        LOGGER.debug("Handling {}: {}", ex.getClass().getSimpleName(), ex);
        return ResponseEntity
                .status(ex.getYouBCError().getStatus())
                .body(ex.getYouBCError());
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<String> handleException(Exception ex) {
        LOGGER.error("Handling unexpected {}: {}", ex.getClass().getSimpleName(), ex);
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ex.getMessage());
    }
}
