package com.example.Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Project.Entity.Client;

import java.util.List;

/**
 * Repository interface for managing Client entities.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    /**
     * Retrieves a list of clients with the specified training plan ID.
     * @param trainingPlanId The ID of the training plan.
     * @return A list of clients with the specified training plan ID.
     */
    List<Client> findByTrainingPlanId(Long trainingPlanId);

}
