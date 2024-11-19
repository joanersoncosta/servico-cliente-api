package com.github.joanersoncosta.servico_cliente_api.cliente.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.Email;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "cliente", uniqueConstraints = {@UniqueConstraint(columnNames = "cpf")})
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "id_cliente")
	private Long idCliente;
    @Column(name = "nome")
	private String nome;
    @Column(name = "cpf", nullable = false, unique = true)
	private String cpf;
    @Column(name = "email")
    @Email(message = "O email deve ser válido.")
	private String email;
    @Column(name = "idade")
	private Integer idade;
}