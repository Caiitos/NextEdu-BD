package com.example.nextedubd.entities.users;

import com.example.nextedubd.entities.content.Matricula;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static com.example.nextedubd.enums.TipoUsuario.ALUNO;

@Entity
@Table(name = "alunos")
public class Aluno extends Usuario {

    @OneToMany(mappedBy = "aluno")
    private List<Matricula> matriculas = new ArrayList<>();

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
