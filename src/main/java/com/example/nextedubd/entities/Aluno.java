package com.example.nextedubd.entities;

import com.example.nextedubd.enums.TipoUsuario;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import static com.example.nextedubd.enums.TipoUsuario.ALUNO;

@Entity
@Table(name = "alunos")
public class Aluno extends Usuario {

    @Column(name = "matricula")
    private String matricula;

    private final TipoUsuario tipo = ALUNO;

    public TipoUsuario getTipo() {
        return tipo;
    }
}
