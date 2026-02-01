package com.lambdaexpression.notificationfiltering;


public class Alert {

    private String message;
    private String type;     // EMERGENCY, MEDICATION, INFO
    private int severity;    

    public Alert(String message, String type, int severity) {
        this.message = message;
        this.type = type;
        this.severity = severity;
    }

    public String getType() {
        return type;
    }

    public int getSeverity() {
        return severity;
    }

    @Override
    public String toString() {
        return "Alert{" +
                "message='" + message + '\'' +
                ", type='" + type + '\'' +
                ", severity=" + severity +
                '}';
    }
}
