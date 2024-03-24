package com.example.Entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
public class TrainingPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trainingPlanID;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "objective")
    private String objective;

    @Column(name = "rating")
    private int rating;

    // Constructors
    public TrainingPlan() {}

    public TrainingPlan(String name, String objective, int rating) {
        this.name = name;
        this.objective = objective;
        this.rating = rating;
    }

    // Getters and Setters
    public Long getTrainingPlanID() {
        return trainingPlanID;
    }

    public void setTrainingPlanID(Long trainingPlanID) {
        this.trainingPlanID = trainingPlanID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // toString() method
    @Override
    public String toString() {
        return "TrainingPlan{" +
                "trainingPlanID=" + trainingPlanID +
                ", name='" + name + '\'' +
                ", objective='" + objective + '\'' +
                ", rating=" + rating +
                '}';
    }
}