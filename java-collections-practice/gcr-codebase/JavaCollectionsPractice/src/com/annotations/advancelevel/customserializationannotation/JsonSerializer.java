package com.annotations.advancelevel.customserializationannotation;

import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object obj) {

        StringBuilder json = new StringBuilder();
        json.append("{");

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        boolean firstField = true;

        for (Field field : fields) {

            // Only serialize fields with @JsonField
            if (field.isAnnotationPresent(JsonField.class)) {

                field.setAccessible(true); // allow access to private fields

                JsonField annotation = field.getAnnotation(JsonField.class);
                String jsonKey = annotation.name();

                try {
                    Object value = field.get(obj);

                    if (!firstField) {
                        json.append(", ");
                    }

                    json.append("\"").append(jsonKey).append("\": ");

                    // If value is String → add quotes
                    if (value instanceof String) {
                        json.append("\"").append(value).append("\"");
                    } else {
                        json.append(value);
                    }

                    firstField = false;

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        json.append("}");
        return json.toString();
    }
}

