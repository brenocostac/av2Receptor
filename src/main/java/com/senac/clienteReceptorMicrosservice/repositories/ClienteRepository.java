package com.senac.clienteReceptorMicrosservice.repositories;

import com.senac.clienteReceptorMicrosservice.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
