package com.example.nextedubd.enums;

public enum TipoUsuario {

    ALUNO("Aluno"),
    PROFESSOR("Professor"),
    ADM("Admin");

    private final String tipo;

    TipoUsuario(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
