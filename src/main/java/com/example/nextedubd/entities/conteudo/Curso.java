package com.example.nextedubd.entities.conteudo;


import com.example.nextedubd.entities.Matricula;
import com.example.nextedubd.entities.usuarios.Professor;
import com.example.nextedubd.enums.NivelCurso;
import com.example.nextedubd.enums.StatusCurso;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;

    @Column(name = "titulo_curso", length = 45,nullable = false)
    private String tituloCurso;

    @Column(name = "descricao_curso", length = 255,nullable = false)
    private String descricaoCurso;

    @Column(name = "carga_horaria", nullable = false)
    private int cargaHoraria;

    @Column(name = "nivel", nullable = false, length = 45)
    @Enumerated(EnumType.STRING)
    private NivelCurso nivel;

    @Column(name = "status",nullable = false,length = 45)
    @Enumerated(EnumType.STRING)
    private StatusCurso status;

    @ManyToOne
    @JoinColumn(name = "fk_professor")
    private Professor professor;

    @OneToMany(mappedBy = "curso")
    @JoinColumn(name = "fk_modulos")
    private List<Modulo> modulos;

    @OneToMany(mappedBy = "curso")
    @JoinColumn(name = "fk_matriculas")
    private List<Matricula> matricula;

    public Curso() {
    }

    public Curso(Long idCurso, String tituloCurso, String descricaoCurso, int cargaHoraria,
                 NivelCurso nivel, StatusCurso status,
                 List<Matricula> matricula, Professor professor) {

        this.idCurso = idCurso;
        this.tituloCurso = tituloCurso;
        this.descricaoCurso = descricaoCurso;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.status = status;
        this.matricula = matricula;
        this.professor = professor;
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

    public NivelCurso getNivel() {
        return nivel;
    }

    public void setNivel(NivelCurso nivel) {
        this.nivel = nivel;
    }

    public StatusCurso getStatus() {
        return status;
    }

    public void setStatus(StatusCurso status) {
        this.status = status;
    }

    public List<Matricula> getMatricula() {
        return matricula;
    }

    public void setMatricula(List<Matricula> matricula) {
        this.matricula = matricula;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return cargaHoraria == curso.cargaHoraria && Objects.equals(idCurso, curso.idCurso) && Objects.equals(tituloCurso, curso.tituloCurso) && Objects.equals(descricaoCurso, curso.descricaoCurso) && nivel == curso.nivel && status == curso.status && Objects.equals(matricula, curso.matricula) && Objects.equals(professor, curso.professor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurso, tituloCurso, descricaoCurso, cargaHoraria, nivel, status, matricula, professor);
    }
}
