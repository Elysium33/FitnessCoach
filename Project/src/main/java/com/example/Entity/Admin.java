package com.example.Entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminID;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "clientID")
    private Long clientID;

    @Column(name = "trainingPlanID")
    private Long trainingPlanID;

    // Constructors
    public Admin() {}

    public Admin(String username, Long clientID, Long trainingPlanID) {
        this.username = username;
        this.clientID = clientID;
        this.trainingPlanID = trainingPlanID;
    }

    // Getters and Setters
    public Long getAdminID() {
        return adminID;
    }

    public void setAdminID(Long adminID) {
        this.adminID = adminID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getClientID() {
        return clientID;
    }

    public void setClientID(Long clientID) {
        this.clientID = clientID;
    }

    public Long getTrainingPlanID() {
        return trainingPlanID;
    }

    public void setTrainingPlanID(Long trainingPlanID) {
        this.trainingPlanID = trainingPlanID;
    }

    // toString() method
    @Override
    public String toString() {
        return "Admin{" +
                "adminID=" + adminID +
                ", username='" + username + '\'' +
                ", clientID=" + clientID +
                ", trainingPlanID=" + trainingPlanID +
                '}';
    }
}