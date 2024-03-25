package com.example.Project.Service;

import com.example.Project.Entity.Client;
import java.util.List;

/**
 * Service interface for managing Client entities.
 */
public interface ClientService {

    /**
     * Retrieves all clients.
     * @return List of all clients.
     */
    List<Client> getAllClients();

    /**
     * Retrieves a client by ID.
     * @param id The ID of the client to retrieve.
     * @return The client with the specified ID, or null if not found.
     */
    Client getClientById(Long id);

    /**
     * Creates a new client.
     * @param client The client object to be created.
     * @return The created client.
     */
    Client createClient(Client client);

    /**
     * Updates an existing client.
     * @param id The ID of the client to update.
     * @param clientDetails The updated client details.
     * @return The updated client.
     */
    Client updateClient(Long id, Client clientDetails);

    /**
     * Deletes a client.
     * @param id The ID of the client to delete.
     */
    void deleteClient(Long id);
}
