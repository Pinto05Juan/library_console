package com.pintojuan.LiterAlura.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConversionData implements Convertible{
    ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public <T> T getData(String json, Class<T> tclass) {
        try {
            return objectMapper.readValue(json, tclass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
