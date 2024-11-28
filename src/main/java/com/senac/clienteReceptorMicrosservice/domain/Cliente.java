package com.senac.clienteReceptorMicrosservice.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity


public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private String cpf;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getStatus() {
        return status;
    }

    @Column
    private int status;

    public Cliente(String nome, String cpf, int status) {
        this.nome = nome;
        this.cpf = cpf;
        this.status = status;
    }
}
