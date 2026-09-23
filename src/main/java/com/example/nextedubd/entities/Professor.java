package com.example.nextedubd.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import static com.example.nextedubd.enums.TipoUsuario.PROFESSOR;

@Entity
@Table(name = "professores")
public class Professor extends Usuario{

    @Column(name = "especialidade", nullable = false)
    private String especialiddae;

    @Column(name = "descrição", length = 255,nullable = true)
    private String descricao;

    public Professor() {
        super();
        setTipoUsuario(PROFESSOR);
    }

    public String getEspecialiddae() {
        return especialiddae;
    }

    public void setEspecialiddae(String especialiddae) {
        this.especialiddae = especialiddae;
    }
}
