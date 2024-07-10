package com.commerce2.ecomerce.Controllers;

import com.commerce2.ecomerce.Entities.Client;
import com.commerce2.ecomerce.Services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/register")
    public ResponseEntity<Client> register(@RequestBody Client client){
        try {
            return new ResponseEntity<>(clientService.save(client), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/me")
    public ResponseEntity<Client> updateProfile(@RequestBody Client client){
        try {
            return clientService.findById(client.getId())
                    .map(c -> new ResponseEntity<>(clientService.save(client), HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
