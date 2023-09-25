package com.springboot.Management.common;

public class NotExistException extends IllegalArgumentException {
    private static final long serialVersionUID = 1L;

    public NotExistException(Long id) {
        super(String.format("There are no data found with Id: %d ", id));
    }
}
