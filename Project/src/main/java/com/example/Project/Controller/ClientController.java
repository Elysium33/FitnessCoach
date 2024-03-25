package com.example.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.Project.Entity.Client;
import com.example.Project.Service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    // Endpoint to get all clients
    @GetMapping("/get")
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clients = clientService.getAllClients();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    // Endpoint to get a client by ID
    @GetMapping("/getbyID/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Long id) {
        Client client = clientService.getClientById(id);
        return client != null ? new ResponseEntity<>(client, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint to create a new client
    @PostMapping("/save")
    @ResponseBody
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        Client savedClient = clientService.createClient(client);
        return new ResponseEntity<>(savedClient, HttpStatus.CREATED);
    }

    // Endpoint to update an existing client
    @PutMapping("updatebyID/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable Long id, @RequestBody Client clientDetails) {
        Client updatedClient = clientService.updateClient(id, clientDetails);
        return updatedClient != null ? new ResponseEntity<>(updatedClient, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint to delete a client
    @DeleteMapping("deletebyID/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

