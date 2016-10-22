package utils;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverterJSON {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> String toJsonToString(List<T> list) throws JsonProcessingException {
        return mapper.writeValueAsString(list);
    }
}
