package com.example.Project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Project.Repository.ClientRepository;
import com.example.Project.Entity.Client;

import java.util.List;

@Service
public class ClientServiceImplementation implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

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

    @Override
    public void deleteClient(Long id) {
        Client existingClient = clientRepository.findById(id).orElse(null);
        if (existingClient != null) {
            clientRepository.delete(existingClient);
        }
    }
}
