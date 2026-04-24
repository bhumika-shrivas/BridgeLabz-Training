package com.annotations.advancelevel.customcachingsystem;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheManager {

    // Simple in-memory cache
    private static final Map<String, Object> cache = new HashMap<>();

    public static Object execute(Object obj, String methodName, Object... args) {

        try {
            Class<?> clazz = obj.getClass();

            // Find method by name and parameter count
            Method[] methods = clazz.getDeclaredMethods();
            Method targetMethod = null;

            for (Method m : methods) {
                if (m.getName().equals(methodName) && m.getParameterCount() == args.length) {
                    targetMethod = m;
                    break;
                }
            }

            if (targetMethod == null) {
                throw new RuntimeException("Method not found!");
            }

            // Check if method has @CacheResult
            if (targetMethod.isAnnotationPresent(CacheResult.class)) {

                // Create cache key: methodName + arguments
                String cacheKey = methodName + "_" + args[0];

                // If result already cached, return it
                if (cache.containsKey(cacheKey)) {
                    System.out.println("Returning cached result for: " + args[0]);
                    return cache.get(cacheKey);
                }

                // Else compute and store in cache
                Object result = targetMethod.invoke(obj, args);
                cache.put(cacheKey, result);
                return result;
            }

            // If no annotation, just execute normally
            return targetMethod.invoke(obj, args);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

