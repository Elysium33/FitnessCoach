package com.example.Project.entity;

import jakarta.persistence.*;

/**
 * Represents a training plan entity in the project.
 * This class is annotated as an entity for persistence.
 */
@Entity
public class TrainingPlan {

    /**
     * The unique identifier for the training plan.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trainingPlanID;

    /**
     * The name of the training plan.
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * The objective of the training plan.
     */
    @Column(name = "objective")
    private String objective;

    /**
     * The rating of the training plan.
     */
    @Column(name = "rating")
    private int rating;

    /**
     * Constructs a new TrainingPlan with default values.
     */
    public TrainingPlan() {}

    /**
     * Constructs a new TrainingPlan with the specified details.
     * @param name The name of the training plan.
     * @param objective The objective of the training plan.
     * @param rating The rating of the training plan.
     */
    public TrainingPlan(String name, String objective, int rating) {
        this.name = name;
        this.objective = objective;
        this.rating = rating;
    }

    /**
     * Retrieves the ID of the training plan.
     * @return The ID of the training plan.
     */
    public Long getTrainingPlanID() {
        return trainingPlanID;
    }

    /**
     * Sets the ID of the training plan.
     * @param trainingPlanID The ID of the training plan.
     */
    public void setTrainingPlanID(Long trainingPlanID) {
        this.trainingPlanID = trainingPlanID;
    }

    /**
     * Retrieves the name of the training plan.
     * @return The name of the training plan.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the training plan.
     * @param name The name of the training plan.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the objective of the training plan.
     * @return The objective of the training plan.
     */
    public String getObjective() {
        return objective;
    }

    /**
     * Sets the objective of the training plan.
     * @param objective The objective of the training plan.
     */
    public void setObjective(String objective) {
        this.objective = objective;
    }

    /**
     * Retrieves the rating of the training plan.
     * @return The rating of the training plan.
     */
    public int getRating() {
        return rating;
    }

    /**
     * Sets the rating of the training plan.
     * @param rating The rating of the training plan.
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * Returns a string representation of the TrainingPlan object.
     * @return A string representation of the TrainingPlan object.
     */
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
