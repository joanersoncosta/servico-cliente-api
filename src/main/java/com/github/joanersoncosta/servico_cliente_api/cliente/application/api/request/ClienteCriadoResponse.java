package com.github.joanersoncosta.servico_cliente_api.cliente.application.api.request;

import java.util.UUID;

import com.github.joanersoncosta.servico_cliente_api.cliente.domain.Cliente;

import lombok.Getter;

@Getter
public class ClienteCriadoResponse {
	
	private UUID idCliente;

	public ClienteCriadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
	}
	
	
}