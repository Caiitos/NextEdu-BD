package com.example.nextedubd.entities.content;

import com.example.nextedubd.entities.users.Aluno;
import com.example.nextedubd.enums.StatusMatricula;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "matriculas")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMatricula;

    @Column(name = "status_matricula", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusMatricula statusMatricula;

    @Column(name = "data_matricula",nullable = false)
    private LocalDate dataMatricula;

    @ManyToOne
    @JoinColumn(name = "fk_alunos", nullable = false)
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "fk_cursos", nullable = false)
    private Curso curso;

    public Matricula() {
    }

    public Matricula(Long idMatricula, StatusMatricula statusMatricula, LocalDate dataMatricula,
                     Aluno aluno, Curso curso) {

        this.idMatricula = idMatricula;
        this.statusMatricula = statusMatricula;
        this.dataMatricula = dataMatricula;
        this.aluno = aluno;
        this.curso = curso;
    }

    public Long getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Long idMatricula) {
        this.idMatricula = idMatricula;
    }

    public StatusMatricula getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(StatusMatricula statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Matricula matricula = (Matricula) o;
        return Objects.equals(idMatricula, matricula.idMatricula)
                && statusMatricula == matricula.statusMatricula
                && Objects.equals(dataMatricula, matricula.dataMatricula)
                && Objects.equals(aluno, matricula.aluno)
                && Objects.equals(curso, matricula.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMatricula, statusMatricula, dataMatricula, aluno, curso);
    }
}
