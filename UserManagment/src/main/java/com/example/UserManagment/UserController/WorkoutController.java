package com.example.UserManagment.UserController;

import com.example.UserManagment.Dto.WorkoutDTO;
import com.example.UserManagment.Service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/workout")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    @PostMapping(path = "/save")
    public ResponseEntity<WorkoutDTO> saveWorkout(@RequestBody WorkoutDTO workoutDTO) {
        WorkoutDTO savedWorkout = workoutService.addWorkout(workoutDTO);
        return ResponseEntity.ok(savedWorkout);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkoutDTO> getWorkoutById(@PathVariable("id") int workoutid) {
        WorkoutDTO workoutDTO = workoutService.getWorkoutById(workoutid);
        return ResponseEntity.ok(workoutDTO);
    }

    @GetMapping("/all")
    public ResponseEntity<List<WorkoutDTO>> getAllWorkouts() {
        List<WorkoutDTO> workouts = workoutService.getAllWorkouts();
        return ResponseEntity.ok(workouts);
    }

    @PutMapping("/id/{id}")
    public ResponseEntity<WorkoutDTO> updateWorkout(@PathVariable("id") int workoutid, @RequestBody WorkoutDTO updatedWorkout) {
        WorkoutDTO workoutDTO = workoutService.updateWorkout(workoutid, updatedWorkout);
        return ResponseEntity.ok(workoutDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteWorkout(@PathVariable("id") int workoutid) {
        workoutService.deleteWorkout(workoutid);
        return ResponseEntity.ok("Workout deleted successfully");
    }
}
