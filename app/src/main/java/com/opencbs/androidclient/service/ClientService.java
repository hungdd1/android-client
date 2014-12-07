package com.opencbs.androidclient.service;

import com.opencbs.androidclient.event.ClientsLoadedEvent;
import com.opencbs.androidclient.event.LoadClientsEvent;
import com.opencbs.androidclient.model.Client;
import com.opencbs.androidclient.repo.ClientRepo;

import java.util.List;

import javax.inject.Inject;

import de.greenrobot.event.EventBus;

public class ClientService {

    @Inject
    ClientRepo clientRepo;

    @Inject
    EventBus bus;

    public void onEventBackgroundThread(final LoadClientsEvent event) {
        List<Client> clients;
        if (event.query.isEmpty()) {
            clients = clientRepo.getAll(event.offset, event.limit);
        } else {
            clients = clientRepo.search(event.query, event.offset, event.limit);
        }
        ClientsLoadedEvent responseEvent = new ClientsLoadedEvent();
        responseEvent.clients = clients;
        bus.post(responseEvent);
    }
}
