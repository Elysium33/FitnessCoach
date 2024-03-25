package com.example.Project.Repository;

import com.example.Project.Entity.TrainingPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing TrainingPlan entities.
 */
@Repository
public interface TrainingPlanRepository extends JpaRepository<TrainingPlan, Long> {

}
