package com.example.Project.entity;

import jakarta.persistence.*;

/**
 * Represents an admin entity in the project.
 * This class is annotated as an entity for persistence.
 */
@Entity
public class Admin {

    /**
     * The unique identifier for the admin.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminID;

    /**
     * The username of the admin.
     */
    @Column(name = "username", nullable = false)
    private String username;

    /**
     * The ID of the client associated with the admin.
     */
    @Column(name = "clientID")
    private Long clientID;

    /**
     * The ID of the training plan associated with the admin.
     */
    @Column(name = "trainingPlanID")
    private Long trainingPlanID;

    /**
     * Constructs a new Admin with default values.
     */
    public Admin() {}

    /**
     * Constructs a new Admin with the specified details.
     * @param username The username of the admin.
     * @param clientID The ID of the client associated with the admin.
     * @param trainingPlanID The ID of the training plan associated with the admin.
     */
    public Admin(String username, Long clientID, Long trainingPlanID) {
        this.username = username;
        this.clientID = clientID;
        this.trainingPlanID = trainingPlanID;
    }

    /**
     * Retrieves the ID of the admin.
     * @return The ID of the admin.
     */
    public Long getAdminID() {
        return adminID;
    }

    /**
     * Sets the ID of the admin.
     * @param adminID The ID of the admin.
     */
    public void setAdminID(Long adminID) {
        this.adminID = adminID;
    }

    /**
     * Retrieves the username of the admin.
     * @return The username of the admin.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the admin.
     * @param username The username of the admin.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Retrieves the ID of the client associated with the admin.
     * @return The ID of the client associated with the admin.
     */
    public Long getClientID() {
        return clientID;
    }

    /**
     * Sets the ID of the client associated with the admin.
     * @param clientID The ID of the client associated with the admin.
     */
    public void setClientID(Long clientID) {
        this.clientID = clientID;
    }

    /**
     * Retrieves the ID of the training plan associated with the admin.
     * @return The ID of the training plan associated with the admin.
     */
    public Long getTrainingPlanID() {
        return trainingPlanID;
    }

    /**
     * Sets the ID of the training plan associated with the admin.
     * @param trainingPlanID The ID of the training plan associated with the admin.
     */
    public void setTrainingPlanID(Long trainingPlanID) {
        this.trainingPlanID = trainingPlanID;
    }

    /**
     * Returns a string representation of the Admin object.
     * @return A string representation of the Admin object.
     */
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
