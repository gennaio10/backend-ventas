package com.ventas.ventas.exception;

import java.util.Date;
import java.util.Map;

public class ExceptionResponse {

    private Date timestamp;
    private String mensaje;
    private String detalle;
    private Map<String, String> errores;

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Map<String, String> getErrores() {
        return errores;
    }

    public void setErrores(Map<String, String> errores) {
        this.errores = errores;
    }

    public ExceptionResponse(Date timestamp, String mensaje, String detalle) {
        this.timestamp = timestamp;
        this.mensaje = mensaje;
        this.detalle = detalle;
    }

    public ExceptionResponse(Date timestamp, String mensaje, String detalle, Map<String, String> errores) {
        this.timestamp = timestamp;
        this.mensaje = mensaje;
        this.detalle = detalle;
        this.errores = errores;
    }

    public ExceptionResponse() { }
}
