package com.application.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value =HttpStatus.NOT_FOUND )
public class DepartmentNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -6117542027186324051L;

	public DepartmentNotFoundException (String message) {
        super(message);
       
    }

 

}