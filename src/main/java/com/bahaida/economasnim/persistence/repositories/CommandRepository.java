package com.bahaida.economasnim.persistence.repositories;

import com.bahaida.economasnim.persistence.domain.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandRepository extends JpaRepository<Commande, Long> {
}
