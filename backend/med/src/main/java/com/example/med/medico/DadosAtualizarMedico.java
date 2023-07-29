package com.example.med.medico;

import com.example.med.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarMedico(
        @NotNull
        Long id,
       String nome,
       String telefone,
       DadosEndereco endereco) {
}
