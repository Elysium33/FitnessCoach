package com.example.Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Project.Entity.Client;

/**
 * Repository interface for managing Client entities.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
