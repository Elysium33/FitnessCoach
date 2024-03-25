package com.example.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Project.Entity.TrainingPlan;
import com.example.Project.Service.TrainingPlanService;

import java.util.List;

@RestController
@RequestMapping("/training-plans")
public class TrainingPlanController {

    private final TrainingPlanService trainingPlanService;

    @Autowired
    public TrainingPlanController(TrainingPlanService trainingPlanService) {
        this.trainingPlanService = trainingPlanService;
    }

    @GetMapping("/get")
    public ResponseEntity<List<TrainingPlan>> getAllTrainingPlans() {
        List<TrainingPlan> trainingPlans = trainingPlanService.getAllTrainingPlans();
        return ResponseEntity.ok(trainingPlans);
    }

    @GetMapping("getbyID/{id}")
    public ResponseEntity<TrainingPlan> getTrainingPlanById(@PathVariable Long id) {
        TrainingPlan trainingPlan = trainingPlanService.getTrainingPlanById(id);
        return trainingPlan != null ? ResponseEntity.ok(trainingPlan) : ResponseEntity.notFound().build();
    }

    @PostMapping("/save")
    public ResponseEntity<TrainingPlan> createTrainingPlan(@RequestBody TrainingPlan trainingPlan) {
        TrainingPlan savedTrainingPlan = trainingPlanService.createTrainingPlan(trainingPlan);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTrainingPlan);
    }

    @PutMapping("updatebyID/{id}")
    public ResponseEntity<TrainingPlan> updateTrainingPlan(@PathVariable Long id, @RequestBody TrainingPlan trainingPlanDetails) {
        TrainingPlan updatedTrainingPlan = trainingPlanService.updateTrainingPlan(id, trainingPlanDetails);
        return updatedTrainingPlan != null ? ResponseEntity.ok(updatedTrainingPlan) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("deletebyID/{id}")
    public ResponseEntity<Void> deleteTrainingPlan(@PathVariable Long id) {
        trainingPlanService.deleteTrainingPlan(id);
        return ResponseEntity.noContent().build();
    }
}
