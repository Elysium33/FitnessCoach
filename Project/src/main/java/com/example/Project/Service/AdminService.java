package com.example.Project.Service;
import com.example.Project.Entity.Admin;
import java.util.List;

public interface AdminService {

    List<Admin> getAllAdmins();

    Admin getAdminById(Long id);

    Admin createAdmin(Admin admin);

    Admin updateAdmin(Long id, Admin adminDetails);

    void deleteAdmin(Long id);
}

