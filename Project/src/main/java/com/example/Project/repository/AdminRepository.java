package com.example.Project.repository;

import com.example.Project.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing Admin entities.
 */
@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
