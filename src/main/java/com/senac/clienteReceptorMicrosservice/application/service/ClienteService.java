package com.senac.clienteReceptorMicrosservice.application.service;

import com.senac.clienteReceptorMicrosservice.domain.Cliente;
import com.senac.clienteReceptorMicrosservice.repositories.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository clienteRepository;

    @RabbitListener(queues = "fila-ecommerce")
    private void subscribe(Cliente cliente){
        Cliente novoCliente = new Cliente(cliente.getNome(),cliente.getCpf(),cliente.getStatus());
        clienteRepository.save(novoCliente);
    }
}
