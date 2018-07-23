package com.bahaida.economasnim.services;

import com.bahaida.economasnim.persistence.domain.Commande;

import java.util.List;

public interface CommandService {
    List<Commande> getAll();
    Commande save(Commande commande);
    Commande getOne(Long id);
    Commande update(Long id, Commande commande);
    boolean delete(Long id);
}
