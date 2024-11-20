package com.github.joanersoncosta.servico_cliente_api.cliente.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.joanersoncosta.servico_cliente_api.cliente.domain.Cliente;

public interface ClienteSpringDataJpaRepository extends JpaRepository<Cliente, UUID>{

}