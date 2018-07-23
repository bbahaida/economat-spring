package com.bahaida.economasnim.services.impl;

import com.bahaida.economasnim.persistence.domain.Agent;
import com.bahaida.economasnim.persistence.repositories.AgentRepository;
import com.bahaida.economasnim.services.AgentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentServiceImpl implements AgentService {

    private AgentRepository agentRepository;

    public AgentServiceImpl(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    @Override
    public Page<Agent> getAll(Pageable pageable) {
        return agentRepository.findAll(pageable);
    }

    @Override
    public Agent getOne(Long id) {
        if(id > 0){
            return agentRepository.getOne(id);
        }
        return null;
    }

    @Override
    public Agent save(Agent agent) {
        return agentRepository.save(agent);
    }

    @Override
    public Agent update(Long id, Agent agent) {
        if(id > 0){

        }
        return null;
    }

    @Override
    public boolean delete(Long id) {
        if(id > 0){
            Agent agent = agentRepository.getOne(id);
            if(agent != null){
                agentRepository.delete(agent);
                return true;
            }
        }
        return false;
    }
}
