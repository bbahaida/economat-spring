package com.bahaida.economasnim.services.impl;

import com.bahaida.economasnim.persistence.domain.Commande;
import com.bahaida.economasnim.persistence.repositories.ArticleCommandRepository;
import com.bahaida.economasnim.persistence.repositories.CommandRepository;
import com.bahaida.economasnim.services.CommandService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandServiceImpl implements CommandService {

    private CommandRepository commandRepository;

    public CommandServiceImpl(CommandRepository commandRepository) {
        this.commandRepository = commandRepository;

    }

    @Override
    public List<Commande> getAll() {
        return commandRepository.findAll();
    }

    @Override
    public Commande save(Commande commande) {
        return commandRepository.save(commande);
    }

    @Override
    public Commande getOne(Long id) {
        return commandRepository.getOne(id);
    }

    @Override
    public Commande update(Long id, Commande commande) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
