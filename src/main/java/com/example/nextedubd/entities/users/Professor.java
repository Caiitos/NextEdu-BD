package com.example.nextedubd.entities.users;

import com.example.nextedubd.entities.content.Curso;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

import static com.example.nextedubd.enums.TipoUsuario.PROFESSOR;

@Entity
@Table(name = "professores")
public class Professor extends Usuario {

    @Column(name = "especialidade", nullable = false)
    private String especialidade;

    @Column(name = "descricao", length = 255)
    private String descricao;

    @OneToMany(mappedBy = "professor")
    private List<Curso> cursos;

    public Professor() {
        super();
        setTipoUsuario(PROFESSOR);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialiddae) {
        this.especialidade = especialiddae;
    }
}
