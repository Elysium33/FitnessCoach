package com.example.Project.Service;

import com.example.Project.Entity.TrainingPlan;
import java.util.List;

/**
 * Service interface for managing TrainingPlan entities.
 */
public interface TrainingPlanService {

    /**
     * Retrieves all training plans.
     * @return List of all training plans.
     */
    List<TrainingPlan> getAllTrainingPlans();

    /**
     * Retrieves a training plan by ID.
     * @param id The ID of the training plan to retrieve.
     * @return The training plan with the specified ID, or null if not found.
     */
    TrainingPlan getTrainingPlanById(Long id);

    /**
     * Creates a new training plan.
     * @param trainingPlan The training plan object to be created.
     * @return The created training plan.
     */
    TrainingPlan createTrainingPlan(TrainingPlan trainingPlan);

    /**
     * Updates an existing training plan.
     * @param id The ID of the training plan to update.
     * @param trainingPlanDetails The updated training plan details.
     * @return The updated training plan.
     */
    TrainingPlan updateTrainingPlan(Long id, TrainingPlan trainingPlanDetails);

    /**
     * Deletes a training plan.
     * @param id The ID of the training plan to delete.
     */
    void deleteTrainingPlan(Long id);
}
