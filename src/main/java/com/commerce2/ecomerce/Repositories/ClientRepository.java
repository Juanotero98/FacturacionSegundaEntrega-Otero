package com.commerce2.ecomerce.Repositories;

import com.commerce2.ecomerce.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
