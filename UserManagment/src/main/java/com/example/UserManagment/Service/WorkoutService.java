package com.example.UserManagment.Service;

import com.example.UserManagment.Dto.WorkoutDTO;

import java.util.List;

public interface WorkoutService {
    WorkoutDTO addWorkout(WorkoutDTO workoutDTO);
    WorkoutDTO getWorkoutByName(String workoutname);
    WorkoutDTO updateWorkout(int workoutid, WorkoutDTO updatedWorkout);
    void deleteWorkout(int workoutid);
    WorkoutDTO getWorkoutById(int workoutid);
    List<WorkoutDTO> getAllWorkouts();
}
