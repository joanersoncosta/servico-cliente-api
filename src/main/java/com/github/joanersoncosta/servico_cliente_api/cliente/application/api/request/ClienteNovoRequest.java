package com.github.joanersoncosta.servico_cliente_api.cliente.application.api.request;

import javax.validation.constraints.NotBlank;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteNovoRequest {
    @Schema(description = "Este é o CPF do cliente", example = "123.456.789-00")
    @NotBlank(message = "Campo CPF não pode estar em branco.")
    private String cpf;

    @Schema(description = "Este é o nome do usuário", example = "Maria Santos")
    @NotBlank(message = "Campo nome não pode estar em branco.")
    private String nome;

    @Schema(description = "Idade do cliente", example = "30")
    private Integer idade;
}