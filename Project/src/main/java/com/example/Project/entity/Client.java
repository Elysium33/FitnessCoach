package com.example.Project.entity;

import jakarta.persistence.*;

/**
 * Represents a client entity in the project.
 * This class is annotated as an entity for persistence.
 */
@Entity
public class Client {

    /**
     * The unique identifier for the client.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The full name of the client.
     */
    @Column(name = "fullName", nullable = false)
    private String fullName;

    /**
     * The username of the client.
     */
    @Column(name = "username", nullable = false)
    private String username;

    /**
     * The email address of the client.
     * It must be unique.
     */
    @Column(name = "email", unique = true)
    private String email;

    /**
     * The ID of the training plan associated with the client.
     */
    @Column(name = "TrainingPlanID")
    private Long trainingPlanID;

    /**
     * Constructs a new Client with default values.
     */
    public Client() {}

    /**
     * Constructs a new Client with the specified details.
     * @param fullName The full name of the client.
     * @param username The username of the client.
     * @param email The email address of the client.
     * @param trainingPlanID The ID of the training plan associated with the client.
     */
    public Client(String fullName, String username, String email, Long trainingPlanID) {
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.trainingPlanID = trainingPlanID;
    }

    /**
     * Retrieves the ID of the client.
     * @return The ID of the client.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the client.
     * @param id The ID of the client.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Retrieves the full name of the client.
     * @return The full name of the client.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the full name of the client.
     * @param fullName The full name of the client.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Retrieves the username of the client.
     * @return The username of the client.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username of the client.
     * @param username The username of the client.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Retrieves the email address of the client.
     * @return The email address of the client.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the client.
     * @param email The email address of the client.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retrieves the ID of the training plan associated with the client.
     * @return The ID of the training plan associated with the client.
     */
    public Long getTrainingPlanID() {
        return trainingPlanID;
    }

    /**
     * Sets the ID of the training plan associated with the client.
     * @param trainingPlanID The ID of the training plan associated with the client.
     */
    public void setTrainingPlanID(Long trainingPlanID) {
        this.trainingPlanID = trainingPlanID;
    }

    /**
     * Returns a string representation of the Client object.
     * @return A string representation of the Client object.
     */
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
}
