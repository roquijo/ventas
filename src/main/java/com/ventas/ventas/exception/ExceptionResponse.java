package com.ventas.ventas.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {

    private Date timestamp;
    private String mensajes;
    private String detalles;
    private Map <String, String> erroresValidacion;

    public ExceptionResponse(Date timestamp, String mensajes, String detalles) {
        this.timestamp = timestamp;
        this.mensajes = mensajes;
        this.detalles = detalles;
    }
}
