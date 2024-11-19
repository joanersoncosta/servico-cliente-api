package com.github.joanersoncosta.servico_cliente_api.cliente.application.api.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClienteNovoRequest {
    @Schema(description = "Este é o nome do usuário", example = "Maria Santos")
    @NotBlank(message = "Campo nome não pode estar em branco.")
    private String nome;
    
	@Schema(description = "Este é o CPF do cliente", example = "123.456.789-00")
    @NotBlank(message = "Campo CPF não pode estar em branco.")
    private String cpf;

    @Email(message = "O email deve ser válido.")
    @Schema(description = "Este é o email do usuário", example = "maria@gmail.com")
    @NotBlank(message = "Campo email não pode estar em branco.")
    private String email;
    
    @Schema(description = "Idade do cliente", example = "30")
    private Integer idade;
}