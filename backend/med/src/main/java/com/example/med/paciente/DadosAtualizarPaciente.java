package com.example.med.paciente;

import com.example.med.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
