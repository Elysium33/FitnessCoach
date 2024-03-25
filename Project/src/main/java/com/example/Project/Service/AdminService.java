package com.example.Project.Service;

import com.example.Project.Entity.Admin;
import java.util.List;

/**
 * Service interface for managing Admin entities.
 */
public interface AdminService {

    /**
     * Retrieves all admins.
     * @return List of all admins.
     */
    List<Admin> getAllAdmins();

    /**
     * Retrieves an admin by ID.
     * @param id The ID of the admin to retrieve.
     * @return The admin with the specified ID, or null if not found.
     */
    Admin getAdminById(Long id);

    /**
     * Creates a new admin.
     * @param admin The admin object to be created.
     * @return The created admin.
     */
    Admin createAdmin(Admin admin);

    /**
     * Updates an existing admin.
     * @param id The ID of the admin to update.
     * @param adminDetails The updated admin details.
     * @return The updated admin.
     */
    Admin updateAdmin(Long id, Admin adminDetails);

    /**
     * Deletes an admin.
     * @param id The ID of the admin to delete.
     */
    void deleteAdmin(Long id);
}
