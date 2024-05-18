package com.example.UserManagment.Mapper;

import com.example.UserManagment.Dto.WorkoutDTO;
import com.example.UserManagment.Entity.Workout;

public class WorkoutMapper {
    public static WorkoutDTO mapToWorkoutDTO(Workout workout) {
        return new WorkoutDTO(
                workout.getWorkoutid(),
                workout.getWorkoutname(),
                workout.getWorkouttype(),
                workout.getWorkoutduration(),
                workout.getWorkoutcalories(),
                workout.getWorkoutdate()
        );
    }

    public static Workout mapToWorkout(WorkoutDTO workoutDTO) {
        return new Workout(
                workoutDTO.getWorkoutid(),
                workoutDTO.getWorkoutname(),
                workoutDTO.getWorkouttype(),
                workoutDTO.getWorkoutduration(),
                workoutDTO.getWorkoutcalories(),
                workoutDTO.getWorkoutdate()
        );
    }
}
