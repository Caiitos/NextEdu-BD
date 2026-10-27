package com.example.nextedubd.entities.conteudo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "aulas")
public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAula;

    @Column(name = "titulo_aula",  nullable = false, length = 45)
    private String titulo;

    @Column(name = "conteudo_aula", nullable = false, length = 255)
    private String conteudo;

    @Column(name = "duracao_aula", nullable = false, unique = true)
    private int duracao;

    @Column(name = "descricao_aula", length = 255)
    private String descricao;

    @Column(name = "video_urls", unique = true, length = 255)
    private String urlVideo;

    private int ordem;

    @ManyToOne
    @JoinColumn(name = "id_modulo", nullable = false)
    private Modulo modulo;

    public Aula() {

    }

    public Aula(Long idAula, String titulo, String conteudo,
                int duracao, String descricao, String urlVideo, int ordem, Modulo modulo) {

        this.idAula = idAula;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.duracao = duracao;
        this.descricao = descricao;
        this.urlVideo = urlVideo;
        this.ordem = ordem;
        this.modulo = modulo;
    }

    public Long getIdAula() {
        return idAula;
    }

    public void setIdAula(Long idAula) {
        this.idAula = idAula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aula aula = (Aula) o;
        return idAula == aula.idAula && duracao == aula.duracao && ordem == aula.ordem && Objects.equals(titulo, aula.titulo) && Objects.equals(conteudo, aula.conteudo) && Objects.equals(descricao, aula.descricao) && Objects.equals(urlVideo, aula.urlVideo) && Objects.equals(modulo, aula.modulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAula, titulo, conteudo, duracao, descricao, urlVideo, ordem, modulo);
    }
}
