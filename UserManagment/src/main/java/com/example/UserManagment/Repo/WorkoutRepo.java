package com.example.UserManagment.Repo;

import com.example.UserManagment.Entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface WorkoutRepo extends JpaRepository<Workout, Integer> {
    Optional<Workout> findOneByWorkoutname(String workoutname);
    Workout findByWorkoutname(String workoutname);
    Optional<Workout> findById(Integer id);
    List<Workout> findAll();
}
