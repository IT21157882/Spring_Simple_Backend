package com.example.UserManagment.Service.Impl;

import com.example.UserManagment.Dto.WorkoutDTO;
import com.example.UserManagment.Exception.ResourceNotFoundException;
import com.example.UserManagment.Mapper.WorkoutMapper;
import com.example.UserManagment.Repo.WorkoutRepo;
import com.example.UserManagment.Service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.UserManagment.Entity.Workout;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkoutServiceImpl implements WorkoutService {

    @Autowired
    private WorkoutRepo workoutRepo;

    @Override
    public WorkoutDTO addWorkout(WorkoutDTO workoutDTO) {
        Workout workout = WorkoutMapper.mapToWorkout(workoutDTO);
        workoutRepo.save(workout);
        return WorkoutMapper.mapToWorkoutDTO(workout);
    }

    @Override
    public WorkoutDTO getWorkoutByName(String workoutname) {
        Workout workout = workoutRepo.findByWorkoutname(workoutname);
        if (workout == null) {
            throw new ResourceNotFoundException("Workout not found");
        }
        return WorkoutMapper.mapToWorkoutDTO(workout);
    }

    @Override
    public WorkoutDTO updateWorkout(int workoutid, WorkoutDTO updatedWorkout) {
        Workout workout = workoutRepo.findById(workoutid).orElseThrow(() -> new ResourceNotFoundException("Workout not found"));
        workout.setWorkoutname(updatedWorkout.getWorkoutname());
        workout.setWorkouttype(updatedWorkout.getWorkouttype());
        workout.setWorkoutduration(updatedWorkout.getWorkoutduration());
        workout.setWorkoutcalories(updatedWorkout.getWorkoutcalories());
        workout.setWorkoutdate(updatedWorkout.getWorkoutdate());
        workoutRepo.save(workout);
        return WorkoutMapper.mapToWorkoutDTO(workout);
    }

    @Override
    public void deleteWorkout(int workoutid) {
        Workout workout = workoutRepo.findById(workoutid).orElseThrow(() -> new ResourceNotFoundException("Workout not found"));
        workoutRepo.delete(workout);
    }

    @Override
    public WorkoutDTO getWorkoutById(int workoutid) {
        Workout workout = workoutRepo.findById(workoutid).orElseThrow(() -> new ResourceNotFoundException("Workout not found"));
        return WorkoutMapper.mapToWorkoutDTO(workout);
    }

    @Override
    public List<WorkoutDTO> getAllWorkouts() {
        List<Workout> workouts = workoutRepo.findAll();
        return workouts.stream().map(WorkoutMapper::mapToWorkoutDTO).collect(Collectors.toList());
    }
}
