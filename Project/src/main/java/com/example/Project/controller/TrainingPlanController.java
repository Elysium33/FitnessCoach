package com.example.Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Project.entity.TrainingPlan;
import com.example.Project.service.TrainingPlanService;

import java.util.List;

/**
 * Controller class to handle HTTP requests related to TrainingPlan entities.
 */
@RestController
@RequestMapping("/training-plans")
public class TrainingPlanController {

    private final TrainingPlanService trainingPlanService;

    /**
     * Constructs a new TrainingPlanController with the specified TrainingPlanService.
     * @param trainingPlanService The TrainingPlanService to be used.
     */
    @Autowired
    public TrainingPlanController(TrainingPlanService trainingPlanService) {
        this.trainingPlanService = trainingPlanService;
    }

    /**
     * Retrieves all training plans.
     * @return ResponseEntity containing a list of all training plans, or an empty list if none found.
     */
    @GetMapping("/get")
    public ResponseEntity<List<TrainingPlan>> getAllTrainingPlans() {
        List<TrainingPlan> trainingPlans = trainingPlanService.getAllTrainingPlans();
        return ResponseEntity.ok(trainingPlans);
    }

    /**
     * Retrieves a training plan by ID.
     * @param id The ID of the training plan to retrieve.
     * @return ResponseEntity containing the training plan if found, or a 404 error if not found.
     */
    @GetMapping("getbyID/{id}")
    public ResponseEntity<TrainingPlan> getTrainingPlanById(@PathVariable Long id) {
        TrainingPlan trainingPlan = trainingPlanService.getTrainingPlanById(id);
        return trainingPlan != null ? ResponseEntity.ok(trainingPlan) : ResponseEntity.notFound().build();
    }

    /**
     * Creates a new training plan.
     * @param trainingPlan The training plan object to be created.
     * @return ResponseEntity containing the created training plan with HTTP status 201 (Created).
     */
    @PostMapping("/save")
    public ResponseEntity<TrainingPlan> createTrainingPlan(@RequestBody TrainingPlan trainingPlan) {
        TrainingPlan savedTrainingPlan = trainingPlanService.createTrainingPlan(trainingPlan);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTrainingPlan);
    }

    /**
     * Updates an existing training plan by ID.
     * @param id The ID of the training plan to update.
     * @param trainingPlanDetails The updated training plan details.
     * @return ResponseEntity containing the updated training plan if found, or a 404 error if not found.
     */
    @PutMapping("updatebyID/{id}")
    public ResponseEntity<TrainingPlan> updateTrainingPlan(@PathVariable Long id, @RequestBody TrainingPlan trainingPlanDetails) {
        TrainingPlan updatedTrainingPlan = trainingPlanService.updateTrainingPlan(id, trainingPlanDetails);
        return updatedTrainingPlan != null ? ResponseEntity.ok(updatedTrainingPlan) : ResponseEntity.notFound().build();
    }

    /**
     * Deletes a training plan by ID.
     * @param id The ID of the training plan to delete.
     * @return ResponseEntity with no content and HTTP status 204 (No Content).
     */
    @DeleteMapping("deletebyID/{id}")
    public ResponseEntity<Void> deleteTrainingPlan(@PathVariable Long id) {
        trainingPlanService.deleteTrainingPlan(id);
        return ResponseEntity.noContent().build();
    }
}
