package com.hairsalon.repository;

import com.hairsalon.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository <Client, String> {
}
