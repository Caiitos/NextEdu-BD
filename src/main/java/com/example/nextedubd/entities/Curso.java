package com.example.nextedubd.entities;


import com.example.nextedubd.enums.NivelCurso;
import com.example.nextedubd.enums.StatusCurso;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "cursos")
public abstract class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;

    @Column(name = "titulo_curso", length = 45,nullable = false)
    private String tituloCurso;

    @Column(name = "descricao_curso", length = 255,nullable = false)
    private String descricaoCurso;

    @Column(name = "carga_horaria", nullable = false)
    private int cargaHoraria;

    @Column(name = "status",nullable = false,length = 45)
    @Enumerated(EnumType.STRING)
    private StatusCurso status;

    @Column(name = "nivel", nullable = false, length = 45)
    @Enumerated(EnumType.STRING)
    private NivelCurso nivel;

    public Curso() {
    }

    public Curso(Long idCurso, String tituloCurso,
                 String descricaoCurso, int cargaHoraria,
                 StatusCurso status, NivelCurso nivel) {

        this.idCurso = idCurso;
        this.tituloCurso = tituloCurso;
        this.descricaoCurso = descricaoCurso;
        this.cargaHoraria = cargaHoraria;
        this.status = status;
        this.nivel = nivel;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getTituloCurso() {
        return tituloCurso;
    }

    public void setTituloCurso(String tituloCurso) {
        this.tituloCurso = tituloCurso;
    }

    public String getDescricaoCurso() {
        return descricaoCurso;
    }

    public void setDescricaoCurso(String descricaoCurso) {
        this.descricaoCurso = descricaoCurso;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public StatusCurso getStatus() {
        return status;
    }

    public void setStatus(StatusCurso status) {
        this.status = status;
    }

    public NivelCurso getNivel() {
        return nivel;
    }

    public void setNivel(NivelCurso nivel) {
        this.nivel = nivel;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return cargaHoraria == curso.cargaHoraria && Objects.equals(idCurso, curso.idCurso)
                && Objects.equals(tituloCurso, curso.tituloCurso)
                && Objects.equals(descricaoCurso, curso.descricaoCurso)
                && status == curso.status && nivel == curso.nivel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurso, tituloCurso, descricaoCurso, cargaHoraria, status, nivel);
    }
}
