package com.bahaida.economasnim.services;

import com.bahaida.economasnim.persistence.domain.Categorie;

import java.util.List;

public interface CategorieService {
    List<Categorie> getAll();
    Categorie save(Categorie categorie);
    Categorie getOne(Long id);
    Categorie update(Long id, Categorie categorie);
    boolean delete(Long id);
}
