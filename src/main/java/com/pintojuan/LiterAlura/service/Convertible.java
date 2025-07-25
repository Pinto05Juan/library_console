package com.pintojuan.LiterAlura.service;

public interface Convertible {
    <T> T getData(String json, Class<T> tclass);
}
