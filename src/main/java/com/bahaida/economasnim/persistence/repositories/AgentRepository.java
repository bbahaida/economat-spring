package com.bahaida.economasnim.persistence.repositories;

import com.bahaida.economasnim.persistence.domain.Agent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent, Long> {
    
}
