package com.example.Project.ObserverService;

import com.example.Project.Entity.Admin;
import com.example.Project.Entity.Client;

/**
 * Interface for an observer that receives notifications about client-related events.
 */
public interface AdminObserver {

    /**
     * Updates the observer with information about a client-related event.
     * @param admin The admin involved in the event.
     * @param client The client involved in the event.
     */
    void update(Admin admin, Client client);
}
