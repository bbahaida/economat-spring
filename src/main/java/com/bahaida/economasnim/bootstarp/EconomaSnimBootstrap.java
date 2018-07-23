package com.bahaida.economasnim.bootstarp;

import com.bahaida.economasnim.persistence.domain.Categorie;
import com.bahaida.economasnim.persistence.repositories.CategorieRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class EconomaSnimBootstrap{} /*implements ApplicationListener<ContextRefreshedEvent> {

    private CategorieRepository categorieRepository;

    public EconomaSnimBootstrap(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        List<Categorie> categories = new ArrayList<>();

        Categorie ouvrier = new Categorie("Ouvrier",28000);
        Categorie cadre = new Categorie("Cadre",46000);
        categories.add(ouvrier);
        categories.add(cadre);
        categorieRepository.saveAll(categories);
    }
}*/
