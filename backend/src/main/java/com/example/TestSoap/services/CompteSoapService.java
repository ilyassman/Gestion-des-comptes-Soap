package com.example.TestSoap.services;

import com.example.TestSoap.entities.Compte;
import com.example.TestSoap.entities.TypeCompte;
import com.example.TestSoap.repositories.CompteRepository;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@WebService(name = "BanqueWS")
public class CompteSoapService {
    @Autowired
    CompteRepository compteRepository;
    @WebMethod
    public List<Compte> getComptes() {
        return compteRepository.findAll();
    }
    @WebMethod
    public Compte getCompteById(@WebParam(name = "id") Long id) {
        return compteRepository.findById(id).orElse(null);
    }
    @WebMethod
    public Compte createCompte(@WebParam(name = "solde") double solde, @WebParam(name = "type") TypeCompte type) {
        Compte compte = new Compte(null,solde,new Date(),type);
        return compteRepository.save(compte);
    }
    @WebMethod
    public boolean deleteCompteById(@WebParam(name = "id") Long id) {
        if (compteRepository.existsById(id)) {
            compteRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
