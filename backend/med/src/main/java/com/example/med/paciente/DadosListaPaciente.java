package com.example.med.paciente;

public record DadosListaPaciente(String Nome, String Telefone, String Cpf) {
    public DadosListaPaciente(Paciente paciente){
        this(paciente.getNome(), paciente.getTelefone(), paciente.getCpf());
    }
}
