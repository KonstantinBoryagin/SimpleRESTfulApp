package com.example.simplerestfulapp.service;

import com.example.simplerestfulapp.model.Client;

import java.util.List;

public interface ClientService {

    void create(Client client);

    List<Client> readAll();

    Client read(int id);

    boolean update(int id, Client client);

    boolean delete(int id);
}
