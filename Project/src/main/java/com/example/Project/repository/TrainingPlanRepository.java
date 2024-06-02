package com.example.Project.repository;

import com.example.Project.entity.TrainingPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing TrainingPlan entities.
 */
@Repository
public interface TrainingPlanRepository extends JpaRepository<TrainingPlan, Long> {

}
