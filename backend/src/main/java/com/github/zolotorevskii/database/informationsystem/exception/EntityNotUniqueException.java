package com.github.zolotorevskii.database.informationsystem.exception;

public class EntityNotUniqueException extends RuntimeException {
    public EntityNotUniqueException(String message) {
        super(message);
    }
}
