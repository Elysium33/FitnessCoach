package com.example.Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Project.Repository.ClientRepository;
import com.example.Project.Entity.Client;

import java.util.List;

/**
 * Service implementation class for managing Client entities.
 */
@Service
public class ClientServiceImplementation implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    /**
     * Retrieves all clients.
     * @return List of all clients.
     */
    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    /**
     * Retrieves a client by ID.
     * @param id The ID of the client to retrieve.
     * @return The client with the specified ID, or null if not found.
     */
    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    /**
     * Creates a new client.
     * @param client The client object to be created.
     * @return The created client.
     */
    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    /**
     * Updates an existing client.
     * @param id The ID of the client to update.
     * @param clientDetails The updated client details.
     * @return The updated client.
     */
    @Override
    public Client updateClient(Long id, Client clientDetails) {
        Client existingClient = clientRepository.findById(id).orElse(null);
        if (existingClient != null) {
            existingClient.setFullName(clientDetails.getFullName());
            existingClient.setUsername(clientDetails.getUsername());
            existingClient.setEmail(clientDetails.getEmail());
            existingClient.setTrainingPlanID(clientDetails.getTrainingPlanID());
            return clientRepository.save(existingClient);
        }
        return null; // Or throw an appropriate exception here
    }

    /**
     * Deletes a client.
     * @param id The ID of the client to delete.
     */
    @Override
    public void deleteClient(Long id) {
        Client existingClient = clientRepository.findById(id).orElse(null);
        if (existingClient != null) {
            clientRepository.delete(existingClient);
        }
    }
}