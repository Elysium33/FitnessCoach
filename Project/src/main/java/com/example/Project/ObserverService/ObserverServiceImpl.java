package com.example.Project.ObserverService;

import com.example.Project.Entity.Admin;
import com.example.Project.Entity.Client;
import org.springframework.stereotype.Service;

/**
 * Implementation of the ObserverService interface that provides functionality for observing
 * changes in clients and notifying admins accordingly.
 */
@Service
public class ObserverServiceImpl implements ClientObserver, AdminObserver {
    private Long clientID; // The ID of the client being observed

    /**
     * Updates the observer with information about a client.
     *
     * @param client The client whose information is being updated.
     */
    @Override
    public void update(Client client) {
        System.out.println("Sending confirmation email to " + client.getUsername());
        this.clientID = client.getId();
    }

    /**
     * Updates the observer with information about an admin and a client.
     *
     * @param admin  The admin being notified.
     * @param client The client related to the notification.
     */
    @Override
    public void update(Admin admin, Client client) {
        System.out.println("Sending admin " + admin.getUsername() + " message about new client " + this.clientID);
    }
}
