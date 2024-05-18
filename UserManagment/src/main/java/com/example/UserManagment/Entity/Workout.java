package com.example.UserManagment.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "workouts")
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workoutid;

    @Column(nullable = false)
    private String workoutname;

    @Column(nullable = false)
    private String workouttype;

    @Column(nullable = false)
    private String workoutduration;

    @Column(nullable = false)
    private String workoutcalories;

    @Column(nullable = false)
    private String workoutdate;

    public Workout(int workoutid, String workoutname, String workouttype, String workoutduration, String workoutcalories, String workoutdate) {
        this.workoutid = workoutid;
        this.workoutname = workoutname;
        this.workouttype = workouttype;
        this.workoutduration = workoutduration;
        this.workoutcalories = workoutcalories;
        this.workoutdate = workoutdate;
    }

    public Workout() {
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
