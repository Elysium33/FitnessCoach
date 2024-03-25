package com.example.Project.Repository;

import com.example.Project.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing Admin entities.
 */
@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
