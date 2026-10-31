package com.example.nextedubd.entities.content;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "modulo_cursos")
public class Modulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idModulo;

    @Column(name = "titulo_modulo", nullable = false, length = 45)
    private String titulo;

    @Column(name = "descricao", length = 255)
    private String descricao;

    @Column(name = "ordem_modulo", nullable = false)
    private int ordem;

    @OneToMany(mappedBy = "modulo")
    private List<Aula> aulas;

    @ManyToOne
    @JoinColumn(name = "fk_curso", nullable = false)
    private Curso curso;

    public Modulo() {

    }

    public Modulo (Long idModulo, String titulo, String descricao, int ordem, Curso curso) {
        this.idModulo = idModulo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.ordem = ordem;
        this.curso = curso;
    }

    public Long getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(Long idModulo) {
        this.idModulo = idModulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
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
        Modulo modulo = (Modulo) o;
        return ordem == modulo.ordem && Objects.equals(idModulo, modulo.idModulo) && Objects.equals(titulo, modulo.titulo) && Objects.equals(descricao, modulo.descricao) && Objects.equals(curso, modulo.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idModulo, titulo, descricao, ordem, curso);
    }
}
