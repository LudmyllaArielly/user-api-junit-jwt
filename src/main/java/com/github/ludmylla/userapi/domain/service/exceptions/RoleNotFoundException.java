package com.github.ludmylla.userapi.domain.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RoleNotFoundException extends EntityNotFoundException {
    private static final long serialVersionUID = -1L;

    public RoleNotFoundException(String message) {
        super(message);
    }

    public RoleNotFoundException(Long id) {
        this(String.format("There is no such code in Role %d" ,id));
    }
}
