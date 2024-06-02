package com.example.Project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.Project.repository.TrainingPlanRepository;
import com.example.Project.entity.TrainingPlan;

/**
 * Service implementation class for managing TrainingPlan entities.
 */
@Service
public class TrainingPlanServiceImplementation implements TrainingPlanService {


    private TrainingPlanRepository trainingPlanRepository;
    public TrainingPlanServiceImplementation(TrainingPlanRepository trainingPlanRepository){
        this.trainingPlanRepository = trainingPlanRepository;
    }

    /**
     * Retrieves all training plans.
     * @return List of all training plans.
     */
    @Override
    public List<TrainingPlan> getAllTrainingPlans() {
        return trainingPlanRepository.findAll();
    }

    /**
     * Retrieves a training plan by ID.
     * @param id The ID of the training plan to retrieve.
     * @return The training plan with the specified ID, or null if not found.
     */
    @Override
    public TrainingPlan getTrainingPlanById(Long id) {
        return trainingPlanRepository.findById(id).orElse(null);
    }

    /**
     * Creates a new training plan.
     * @param trainingPlan The training plan object to be created.
     * @return The created training plan.
     */
    @Override
    public TrainingPlan createTrainingPlan(TrainingPlan trainingPlan) {
        return trainingPlanRepository.save(trainingPlan);
    }

    /**
     * Updates an existing training plan.
     * @param id The ID of the training plan to update.
     * @param trainingPlanDetails The updated training plan details.
     * @return The updated training plan.
     */
    @Override
    public TrainingPlan updateTrainingPlan(Long id, TrainingPlan trainingPlanDetails) {
        TrainingPlan existingTrainingPlan = trainingPlanRepository.findById(id).orElse(null);
        if (existingTrainingPlan != null) {
            existingTrainingPlan.setName(trainingPlanDetails.getName());
            existingTrainingPlan.setObjective(trainingPlanDetails.getObjective());
            existingTrainingPlan.setRating(trainingPlanDetails.getRating());
            return trainingPlanRepository.save(existingTrainingPlan);
        }
        return null;
    }

    /**
     * Deletes a training plan.
     * @param id The ID of the training plan to delete.
     */
    @Override
    public void deleteTrainingPlan(Long id) {
        TrainingPlan existingTrainingPlan = trainingPlanRepository.findById(id).orElse(null);
        if (existingTrainingPlan != null) {
            trainingPlanRepository.delete(existingTrainingPlan);
        }
    }
}
