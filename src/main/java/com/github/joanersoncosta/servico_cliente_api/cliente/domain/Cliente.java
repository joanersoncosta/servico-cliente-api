package com.github.joanersoncosta.servico_cliente_api.cliente.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Cliente {
	
	private Long idCliente;
	private String cpf;
	private String nome;
	private Integer idade;
}