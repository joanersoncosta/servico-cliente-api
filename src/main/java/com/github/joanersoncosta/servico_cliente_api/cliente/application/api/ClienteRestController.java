package com.github.joanersoncosta.servico_cliente_api.cliente.application.api;

import org.springframework.web.bind.annotation.RestController;

import com.github.joanersoncosta.servico_cliente_api.cliente.application.api.request.ClienteCriadoResponse;
import com.github.joanersoncosta.servico_cliente_api.cliente.application.api.request.ClienteNovoRequest;
import com.github.joanersoncosta.servico_cliente_api.cliente.application.service.ClienteService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteRestController implements ClienteAPI {
	private final ClienteService clienteService;
	
	@Override
	public ClienteCriadoResponse criaNovoCliente(ClienteNovoRequest clienteRequest) {
		log.info("[start] ClienteRestController - criaNovoCliente");
		ClienteCriadoResponse clienteCriadoResponse = clienteService.criaNovoCliente(clienteRequest);
		log.info("[finish] ClienteRestController - criaNovoCliente");
		return clienteCriadoResponse;
	}

}