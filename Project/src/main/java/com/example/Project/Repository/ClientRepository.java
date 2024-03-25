package com.example.Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Project.Entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
