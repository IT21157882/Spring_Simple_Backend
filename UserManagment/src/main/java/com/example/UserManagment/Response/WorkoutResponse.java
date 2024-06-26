package com.example.UserManagment.Response;

public class WorkoutResponse {

    private String message;
    private Boolean status;

    public WorkoutResponse(String message, Boolean status) {
        this.message = message;
        this.status = status;
    }

    public WorkoutResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "WorkoutResponse{" +
                "message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
