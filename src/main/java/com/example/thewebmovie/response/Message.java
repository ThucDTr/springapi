package com.example.thewebmovie.response;

public class Message {
    String message;
    boolean status;

    public Message(String message, boolean status) {
        this.message = message;
        this.status = status;
    }
    public Message() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
