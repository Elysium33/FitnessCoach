package com.example.Project.ObserverService;

import com.example.Project.Entity.Admin;
import com.example.Project.Entity.Client;
import org.springframework.stereotype.Service;

@Service
public class ObserverServiceImpl implements ClientObserver, AdminObserver {
    private Long clientID;

    @Override
    public void update(Client client) {
        System.out.println("Sending confirmation email to " + client.getUsername());
        this.clientID = client.getId();
    }

    @Override
    public void update(Admin admin, Client client) {
        System.out.println("Sending admin " + admin.getUsername() + " message about new client " + this.clientID);

    }
}
