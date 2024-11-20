package com.github.joanersoncosta.servico_cliente_api.cliente.application.service;

import org.springframework.stereotype.Service;

import com.github.joanersoncosta.servico_cliente_api.cliente.application.api.request.ClienteCriadoResponse;
import com.github.joanersoncosta.servico_cliente_api.cliente.application.api.request.ClienteNovoRequest;
import com.github.joanersoncosta.servico_cliente_api.cliente.domain.Cliente;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;
	
	@Override
	public ClienteCriadoResponse criaNovoCliente(ClienteNovoRequest clienteRequest) {
		log.info("[start] UsuarioApplicationService - criaNovoUsuario");
		log.debug("[clienteRequest] {}", clienteRequest.toString());
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finish] UsuarioApplicationService - criaNovoUsuario");
		return new ClienteCriadoResponse(cliente);
	}

}