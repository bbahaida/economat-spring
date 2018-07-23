package com.bahaida.economasnim.controllers;

import com.bahaida.economasnim.persistence.domain.Agent;
import com.bahaida.economasnim.persistence.domain.Categorie;
import com.bahaida.economasnim.persistence.repositories.AgentRepository;
import com.bahaida.economasnim.services.AgentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/agents")
public class AgentController {

    private Logger logger = LoggerFactory.getLogger(AgentController.class);

    private AgentService agentService;

    public AgentController(AgentService agentService) {
        this.agentService = agentService;
    }

    @GetMapping
    public Page<Agent> getAll(Pageable pageable){
        return agentService.getAll(pageable);
    }

    @GetMapping("/{id}")
    public Agent getOne(@PathVariable("id") Long id){
        return agentService.getOne(id);
    }


    @PostMapping
    public Agent addAgent(@RequestBody Agent agent){
        logger.info(agent.toString());
        return agentService.save(agent);
    }


}
