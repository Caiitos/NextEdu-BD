package com.example.nextedubd.enums;

public enum NivelCurso {

    INICIANTE("Iniciante"),
    INTERMEDIARIO("Intermediario"),
    AVAÇADO("Avançaddo");

    private final String Nivel;

    NivelCurso(String nivel) {
        Nivel = nivel;
    }

    public String getNivel() {
        return Nivel;
    }
}
