package com.bahaida.economasnim.controllers;

import com.bahaida.economasnim.persistence.domain.Categorie;
import com.bahaida.economasnim.persistence.repositories.CategorieRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CategorieController {

    private CategorieRepository categorieRepository;

    public CategorieController(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @GetMapping("/categories")
    public List<Categorie> getAll(){
        return categorieRepository.findAll();
    }
}
