package com.example.nextedubd.services.users;

import com.example.nextedubd.entities.users.Aluno;
import com.example.nextedubd.enums.StatusMatricula;
import com.example.nextedubd.repositories.users.AlunoRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import org.springframework.beans.factory.annotation.Autowired;

public class AlunoServices {

    @Autowired
    private AlunoRepository repository;

    public Aluno salvarAluno(Aluno aluno){
        return repository.save(aluno);
    }

    public void atualizarAluno(Long id, Aluno aluno){
        Aluno alunoExistente = repository.findById(id).orElse(null);

        if (alunoExistente != null){
            alunoExistente.setNomeUsuario(aluno.getNomeUsuario());
            alunoExistente.setEmailUsuario(aluno.getEmailUsuario());
            alunoExistente.setSenhaUsuario(aluno.getSenhaUsuario());

            repository.save(alunoExistente);
        }
    }

    public void desativarAluno(Long id, Aluno aluno){
        aluno = repository.findById(id).orElse(aluno);
        aluno.setAtivo(false);
        repository.save(aluno);
    }
}
