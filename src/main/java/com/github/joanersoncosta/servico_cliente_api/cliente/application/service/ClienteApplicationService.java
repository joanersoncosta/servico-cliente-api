package com.github.joanersoncosta.servico_cliente_api.cliente.application.service;

import org.springframework.stereotype.Service;

import com.github.joanersoncosta.servico_cliente_api.cliente.application.api.request.ClienteCriadoResponse;
import com.github.joanersoncosta.servico_cliente_api.cliente.application.api.request.ClienteNovoRequest;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteCriadoResponse criaNovoCliente(ClienteNovoRequest clienteRequest) {
		log.info("[start] UsuarioApplicationService - criaNovoUsuario");
		log.debug("[clienteRequest] {}", clienteRequest.toString());
		log.info("[finish] UsuarioApplicationService - criaNovoUsuario");
		return null;
	}

}