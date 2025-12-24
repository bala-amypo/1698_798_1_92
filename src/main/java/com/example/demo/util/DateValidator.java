package com.example.demo.util;

import java.time.LocalDateTime;

public class DateValidator {

    public static void validateNotFuture(LocalDateTime dateTime) {

        if (dateTime == null) {
            throw new IllegalArgumentException("date cannot be null");
        }

        if (dateTime.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("date cannot be in the future");
        }
    }
}
