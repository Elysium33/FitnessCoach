package com.example.Entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullName", nullable = false)
    private String fullName;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "TrainingPlanID")
    private Long trainingPlanID;

    // Constructors
    public Client() {}

    public Client(String fullName, String username, String email, Long trainingPlanID) {
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.trainingPlanID = trainingPlanID;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    // toString() method
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", trainingPlanID='" + trainingPlanID + '\'' +
                '}';
    }

    public Long getTrainingPlanID() {
        return trainingPlanID;
    }

}

