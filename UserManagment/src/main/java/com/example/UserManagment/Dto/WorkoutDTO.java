package com.example.UserManagment.Dto;

public class WorkoutDTO {

    private int workoutid;
    private String workoutname;
    private String workouttype;
    private String workoutduration;
    private String workoutcalories;
    private String workoutdate;

    public WorkoutDTO(int workoutid, String workoutname, String workouttype, String workoutduration, String workoutcalories, String workoutdate) {
        this.workoutid = workoutid;
        this.workoutname = workoutname;
        this.workouttype = workouttype;
        this.workoutduration = workoutduration;
        this.workoutcalories = workoutcalories;
        this.workoutdate = workoutdate;
    }

    public WorkoutDTO() {
    }

    public int getWorkoutid() {
        return workoutid;
    }

    public void setWorkoutid(int workoutid) {
        this.workoutid = workoutid;
    }

    public String getWorkoutname() {
        return workoutname;
    }

    public void setWorkoutname(String workoutname) {
        this.workoutname = workoutname;
    }

    public String getWorkouttype() {
        return workouttype;
    }

    public void setWorkouttype(String workouttype) {
        this.workouttype = workouttype;
    }

    public String getWorkoutduration() {
        return workoutduration;
    }

    public void setWorkoutduration(String workoutduration) {
        this.workoutduration = workoutduration;
    }

    public String getWorkoutcalories() {
        return workoutcalories;
    }

    public void setWorkoutcalories(String workoutcalories) {
        this.workoutcalories = workoutcalories;
    }

    public String getWorkoutdate() {
        return workoutdate;
    }

    public void setWorkoutdate(String workoutdate) {
        this.workoutdate = workoutdate;
    }
}
