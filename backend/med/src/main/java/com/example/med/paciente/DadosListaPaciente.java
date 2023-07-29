package com.example.med.paciente;

public record DadosListaPaciente(Long Id, String Nome, String Telefone, String Cpf) {
    public DadosListaPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNome(), paciente.getTelefone(), paciente.getCpf());
    }
}
