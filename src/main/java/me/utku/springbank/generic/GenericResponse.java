package me.utku.springbank.generic;

import org.springframework.http.ResponseEntity;

public record GenericResponse<T>(int statusCode, T data) {
    public ResponseEntity<GenericResponse<T>> toResponseEntity() {
        return ResponseEntity.status(statusCode).body(this);
    }
}
