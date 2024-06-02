package com.example.Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Project.entity.Admin;
import com.example.Project.service.AdminService;

import java.util.List;

/**
 * Controller class to handle HTTP requests related to Admin entities.
 */
@RestController
@RequestMapping("/admins")
public class AdminController {

    private final AdminService adminService;

    /**
     * Constructs a new AdminController with the specified AdminService.
     * @param adminService The AdminService to be used.
     */
    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    /**
     * Retrieves all admins.
     * @return ResponseEntity containing a list of all admins, or an empty list if none found.
     */
    @GetMapping("/get")
    public ResponseEntity<List<Admin>> getAllAdmins() {
        List<Admin> admins = adminService.getAllAdmins();
        return ResponseEntity.ok(admins);
    }

    /**
     * Retrieves an admin by ID.
     * @param id The ID of the admin to retrieve.
     * @return ResponseEntity containing the admin if found, or a 404 error if not found.
     */
    @GetMapping("getbyID/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable Long id) {
        Admin admin = adminService.getAdminById(id);
        return admin != null ? ResponseEntity.ok(admin) : ResponseEntity.notFound().build();
    }

    /**
     * Creates a new admin.
     * @param admin The admin object to be created.
     * @return ResponseEntity containing the created admin with HTTP status 201 (Created).
     */
    @PostMapping("/save")
    public ResponseEntity<Admin> createAdmin(@RequestBody Admin admin) {
        Admin savedAdmin = adminService.createAdmin(admin);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAdmin);
    }

    /**
     * Updates an existing admin by ID.
     * @param id The ID of the admin to update.
     * @param adminDetails The updated admin details.
     * @return ResponseEntity containing the updated admin if found, or a 404 error if not found.
     */
    @PutMapping("updatebyID/{id}")
    public ResponseEntity<Admin> updateAdmin(@PathVariable Long id, @RequestBody Admin adminDetails) {
        Admin updatedAdmin = adminService.updateAdmin(id, adminDetails);
        return updatedAdmin != null ? ResponseEntity.ok(updatedAdmin) : ResponseEntity.notFound().build();
    }

    /**
     * Deletes an admin by ID.
     * @param id The ID of the admin to delete.
     * @return ResponseEntity with no content and HTTP status 204 (No Content).
     */
    @DeleteMapping("deletebyID/{id}")
    public ResponseEntity<Void> deleteAdmin(@PathVariable Long id) {
        adminService.deleteAdmin(id);
        return ResponseEntity.noContent().build();
    }
}
