package com.github.joanersoncosta.servico_cliente_api.cliente.application.service;

import com.github.joanersoncosta.servico_cliente_api.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);

}