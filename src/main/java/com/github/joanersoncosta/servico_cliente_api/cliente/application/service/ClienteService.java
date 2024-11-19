package com.github.joanersoncosta.servico_cliente_api.cliente.application.service;

import com.github.joanersoncosta.servico_cliente_api.cliente.application.api.request.ClienteCriadoResponse;
import com.github.joanersoncosta.servico_cliente_api.cliente.application.api.request.ClienteNovoRequest;

public interface ClienteService {
	ClienteCriadoResponse criaNovoCliente(ClienteNovoRequest clienteRequest);

}