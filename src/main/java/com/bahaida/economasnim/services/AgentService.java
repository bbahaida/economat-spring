package com.bahaida.economasnim.services;

import com.bahaida.economasnim.persistence.domain.Agent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AgentService {
    Page<Agent> getAll(Pageable pageable);
    Agent save(Agent agent);
    Agent getOne(Long id);
    Agent update(Long id, Agent agent);
    boolean delete(Long id);
}
