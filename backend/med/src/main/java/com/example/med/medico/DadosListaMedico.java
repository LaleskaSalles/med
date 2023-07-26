package com.example.med.medico;

public record DadosListaMedico(String nome, String email, String crm, Especialidade especialidade) {
    public DadosListaMedico(Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
