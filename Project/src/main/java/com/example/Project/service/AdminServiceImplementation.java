package com.example.Project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.Project.repository.AdminRepository;
import com.example.Project.entity.Admin;

/**
 * Service implementation class for managing Admin entities.
 */
@Service
public class AdminServiceImplementation implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    //@Autowired
    //public AdminServiceImplementation(AdminRepository adminRepository){
       // this.adminRepository = adminRepository;
    //}

    /**
     * Retrieves all admins.
     * @return List of all admins.
     */
    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    /**
     * Retrieves an admin by ID.
     * @param id The ID of the admin to retrieve.
     * @return The admin with the specified ID, or null if not found.
     */
    @Override
    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }

    /**
     * Creates a new admin.
     * @param admin The admin object to be created.
     * @return The created admin.
     */
    @Override
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    /**
     * Updates an existing admin.
     * @param id The ID of the admin to update.
     * @param adminDetails The updated admin details.
     * @return The updated admin.
     */
    @Override
    public Admin updateAdmin(Long id, Admin adminDetails) {
        Admin existingAdmin = adminRepository.findById(id).orElse(null);
        if (existingAdmin != null) {
            existingAdmin.setUsername(adminDetails.getUsername());
            existingAdmin.setClientID(adminDetails.getClientID());
            existingAdmin.setTrainingPlanID(adminDetails.getTrainingPlanID());
            return adminRepository.save(existingAdmin);
        }
        return null;
    }

    /**
     * Deletes an admin.
     * @param id The ID of the admin to delete.
     */
    @Override
    public void deleteAdmin(Long id) {
        Admin existingAdmin = adminRepository.findById(id).orElse(null);
        if (existingAdmin != null) {
            adminRepository.delete(existingAdmin);
        }
    }
}
