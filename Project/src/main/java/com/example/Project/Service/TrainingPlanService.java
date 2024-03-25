package com.example.Project.Service;
import com.example.Project.Entity.TrainingPlan;
import java.util.List;

public interface TrainingPlanService {

    List<TrainingPlan> getAllTrainingPlans();

    TrainingPlan getTrainingPlanById(Long id);

    TrainingPlan createTrainingPlan(TrainingPlan trainingPlan);

    TrainingPlan updateTrainingPlan(Long id, TrainingPlan trainingPlanDetails);

    void deleteTrainingPlan(Long id);
}
