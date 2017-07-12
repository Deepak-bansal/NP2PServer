package com.nucleussoftware.p2p.dto.response.generic;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Locale;
import java.util.StringJoiner;

@JsonPropertyOrder({"code", "message", "data"})
public class ApiResponseDTO<T> implements ResponseDTO<T> {

    private int code = 0;
    private String message = "";
    private T data;

    public ApiResponseDTO() {
    }

    public ApiResponseDTO(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    private Locale getLocale(String locale) {
        return locale != null ? new Locale(locale) : Locale.UK;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("code = " + code)
                .add("message = " + message)
                .add("data = " + data).toString();
    }
}
