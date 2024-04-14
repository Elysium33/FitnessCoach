package com.example.Project.ObserverService;

import com.example.Project.Entity.Client;

/**
 * Interface for an observer that receives notifications about client-related events.
 */
public interface ClientObserver {

        /**
         * Updates the observer with information about a client-related event.
         * @param client The client involved in the event.
         */
        void update(Client client);
}
