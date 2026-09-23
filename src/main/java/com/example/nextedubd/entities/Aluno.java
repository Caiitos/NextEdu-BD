package com.example.nextedubd.entities;

import com.example.nextedubd.enums.StatusMatricula;
import jakarta.persistence.*;

import static com.example.nextedubd.enums.TipoUsuario.ALUNO;

@Entity
@Table(name = "alunos")
public class Aluno extends Usuario {

    @Column(name = "matricula",nullable = false,unique = true)
    private String matricula;

    @Column(name = "status_matricula", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusMatricula statusMatricula;


    public Aluno() {
        super();
        setTipoUsuario(ALUNO);
    }

    public StatusMatricula getStatusMatricula() {
        return statusMatricula;
    }

    public String getMatricula() {
        return matricula;
    }

}
