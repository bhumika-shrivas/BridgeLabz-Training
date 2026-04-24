package com.lambdaexpression.notificationfiltering;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AlertFilter {

    public static List<Alert> filterAlerts(
            List<Alert> alerts,
            Predicate<Alert> condition) {

        return alerts.stream()
                     .filter(condition)
                     .collect(Collectors.toList());
    }
}
