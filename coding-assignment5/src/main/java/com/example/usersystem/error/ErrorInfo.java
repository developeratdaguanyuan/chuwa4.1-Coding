package com.example.usersystem.error;

public class ErrorInfo {

    public ErrorInfo(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public ErrorInfo() {
    }

    private String id;
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
