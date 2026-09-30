package com.example.nextedubd.entities.usuarios;

import com.example.nextedubd.entities.Matricula;
import jakarta.persistence.*;

import java.util.List;

import static com.example.nextedubd.enums.TipoUsuario.ALUNO;

@Entity
@Table(name = "alunos")
public class Aluno extends Usuario {

    @Column(name = "matricula",nullable = false,unique = true)
    @OneToMany(mappedBy = "aluno")
    private List<Matricula> matriculas;

    public Aluno() {
        super();
        setTipoUsuario(ALUNO);

    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }
}
