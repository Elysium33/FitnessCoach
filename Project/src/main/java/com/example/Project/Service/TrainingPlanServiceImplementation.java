package com.example.Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.example.Project.Repository.TrainingPlanRepository;
import com.example.Project.Entity.TrainingPlan;

@Service
public class TrainingPlanServiceImplementation implements TrainingPlanService {

    @Autowired
    private TrainingPlanRepository trainingPlanRepository;

    @Override
    public List<TrainingPlan> getAllTrainingPlans() {
        return trainingPlanRepository.findAll();
    }

    @Override
    public TrainingPlan getTrainingPlanById(Long id) {
        return trainingPlanRepository.findById(id).orElse(null);
    }

    @Override
    public TrainingPlan createTrainingPlan(TrainingPlan trainingPlan) {
        return trainingPlanRepository.save(trainingPlan);
    }

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

    @Override
    public void deleteTrainingPlan(Long id) {
        TrainingPlan existingTrainingPlan = trainingPlanRepository.findById(id).orElse(null);
        if (existingTrainingPlan != null) {
            trainingPlanRepository.delete(existingTrainingPlan);
        }
    }
}

