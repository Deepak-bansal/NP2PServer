package com.nucleussoftware.p2p.dto.response.generic;

public interface ResponseDTO<T> {

    int getCode();

    void setCode(int code);

    String getMessage();

    void setMessage(String message);

    T getData();

    void setData(T data);
}
