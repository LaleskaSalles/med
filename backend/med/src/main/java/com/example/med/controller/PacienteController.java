package com.example.med.controller;

import com.example.med.paciente.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados){

        repository.save(new Paciente(dados));
    }

    @GetMapping
    public Page<DadosListaPaciente> listaPaciente(Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListaPaciente::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarPaciente dados){
        var paciente = repository.getReferenceById(dados.id());
        paciente.atualizarInfo(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void desativar(@PathVariable Long id){
        var paciente = repository.getReferenceById(id);
        paciente.desativar();
    }
}
