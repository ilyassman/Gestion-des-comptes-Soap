package com.example.TestSoap.repositories;

import com.example.TestSoap.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
