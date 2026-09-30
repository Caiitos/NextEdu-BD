package com.example.nextedubd.entities.usuarios;

import com.example.nextedubd.enums.TipoUsuario;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Column(name = "nome_usuario", nullable = false, length = 45)
    private String nomeUsuario;

    @Column(name = "email_usuario",nullable = false, length = 150, unique = true)
    private String emailUsuario;

    @Column(name = "senha_usuario", nullable = false, length = 255)
    private String senhaUsuario;

    @Column(name = "data_cadastro",nullable = false)
    private LocalDate dataCadastro;

    @Column(name = "tipo_usuario",nullable = false, length = 45)
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;

    @Column(name = "usuario_ativo", nullable = false)
    private boolean isAtivo = true;

    @PrePersist
    private void antesDeSalvar(){
        this.dataCadastro = LocalDate.now();
    }

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nomeUsuario,
                   String emailUsuario, String senhaUsuario,
                   LocalDate dataCadastro, boolean isAtivo, TipoUsuario tipoUsuario) {

        this.idUsuario = idUsuario;
        this.tipoUsuario = tipoUsuario;
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
        this.dataCadastro = dataCadastro;
        this.isAtivo = isAtivo;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public boolean isAtivo() {
        return isAtivo;
    }

    public void setAtivo(boolean ativo) {
        isAtivo = ativo;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    protected void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(idUsuario, usuario.idUsuario)
                && isAtivo == usuario.isAtivo && Objects.equals(nomeUsuario, usuario.nomeUsuario)
                && Objects.equals(emailUsuario, usuario.emailUsuario) && Objects.equals(senhaUsuario, usuario.senhaUsuario)
                && Objects.equals(dataCadastro, usuario.dataCadastro) && tipoUsuario == usuario.tipoUsuario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, nomeUsuario, emailUsuario, senhaUsuario, dataCadastro, tipoUsuario, isAtivo);
    }
}
