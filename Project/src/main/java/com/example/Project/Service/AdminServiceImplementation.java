package com.example.Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.example.Project.Repository.AdminRepository;
import com.example.Project.Entity.Admin;

@Service
public class AdminServiceImplementation implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public Admin getAdminById(Long id) {
        return adminRepository.findById(id).orElse(null);
    }

    @Override
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

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

    @Override
    public void deleteAdmin(Long id) {
        Admin existingAdmin = adminRepository.findById(id).orElse(null);
        if (existingAdmin != null) {
            adminRepository.delete(existingAdmin);
        }
    }
}

