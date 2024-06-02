package com.example.Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Project.entity.Client;
import com.example.Project.service.ClientService;

import java.util.List;

/**
 * Controller class to handle HTTP requests related to Client entities.
 */
@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    /**
     * Constructs a new ClientController with the specified ClientService.
     * @param clientService The ClientService to be used.
     */
    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    /**
     * Retrieves all clients.
     * @return ResponseEntity containing a list of all clients, or an empty list if none found.
     */
    @GetMapping("/get")
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clients = clientService.getAllClients();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    /**
     * Retrieves a client by ID.
     * @param id The ID of the client to retrieve.
     * @return ResponseEntity containing the client if found, or a 404 error if not found.
     */
    @GetMapping("/getbyID/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Long id) {
        Client client = clientService.getClientById(id);
        return client != null ? new ResponseEntity<>(client, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /**
     * Creates a new client.
     * @param client The client object to be created.
     * @return ResponseEntity containing the created client with HTTP status 201 (Created).
     */
    @PostMapping("/save")
    @ResponseBody
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        Client savedClient = clientService.createClient(client);
        return new ResponseEntity<>(savedClient, HttpStatus.CREATED);
    }

    /**
     * Updates an existing client by ID.
     * @param id The ID of the client to update.
     * @param clientDetails The updated client details.
     * @return ResponseEntity containing the updated client if found, or a 404 error if not found.
     */
    @PutMapping("updatebyID/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable Long id, @RequestBody Client clientDetails) {
        Client updatedClient = clientService.updateClient(id, clientDetails);
        return updatedClient != null ? new ResponseEntity<>(updatedClient, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /**
     * Deletes a client by ID.
     * @param id The ID of the client to delete.
     * @return ResponseEntity with no content and HTTP status 204 (No Content).
     */
    @DeleteMapping("deletebyID/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    /**
     * Retrieves all clients without a training plan.
     *
     * @return ResponseEntity containing a list of clients with no training plan, or an empty list if none found.
     */
    @GetMapping("/getbyNoTraining")
    public ResponseEntity<List<Client>> getClientsWithNoTrainingPlan() {
        List<Client> clientsWithNoTrainingPlan = clientService.getClientsWithNoTrainingPlan();
        return new ResponseEntity<>(clientsWithNoTrainingPlan, HttpStatus.OK);
    }
}
