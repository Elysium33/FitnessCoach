package com.example.Project.ObserverService;

import com.example.Project.Entity.Admin;
import com.example.Project.Entity.Client;

public interface AdminObserver {
    void update(Admin admin, Client client);
}
