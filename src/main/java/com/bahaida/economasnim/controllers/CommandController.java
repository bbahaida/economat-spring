package com.bahaida.economasnim.controllers;

import com.bahaida.economasnim.persistence.domain.Commande;
import com.bahaida.economasnim.persistence.repositories.CommandRepository;
import com.bahaida.economasnim.services.CommandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/commands")
public class CommandController {

    private CommandService commandService;

    public CommandController(CommandService commandService) {
        this.commandService = commandService;
    }

    @GetMapping
    public List<Commande> getAll(){
        return commandService.getAll();
    }
    @GetMapping("/{id}")
    public Commande getOne(@PathVariable("id") Long id){
        return commandService.getOne(id);
    }
}
