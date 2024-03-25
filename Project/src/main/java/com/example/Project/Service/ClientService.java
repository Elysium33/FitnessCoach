package com.example.Project.Service;
import com.example.Project.Entity.Client;
import java.util.List;

public interface ClientService {

    List<Client> getAllClients();

    Client getClientById(Long id);

    Client createClient(Client client);

    Client updateClient(Long id, Client clientDetails);

    void deleteClient(Long id);
}

