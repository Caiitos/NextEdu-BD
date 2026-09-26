package com.example.nextedubd.enums;

public enum NivelCurso {

    INICIANTE("Iniciante"),
    INTERMEDIARIO("Intermediário"),
    AVACADO("Avançado");

    private final String nivel;

    NivelCurso(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }
}
