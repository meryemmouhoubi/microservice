package com.example.client.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.client.repositories.ClientRepository;
import com.example.client.entities.Client;


import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients")
    public List cherhcerClient()
    {
        return clientRepository.findAll();
    }

    @GetMapping("/clients/{id}")
    public Client chercherUnClient(@PathVariable Long id) throws
            Exception{
        return  this.clientRepository.findById(id).orElseThrow(() -> new Exception("Client inexistant"));

    }
}