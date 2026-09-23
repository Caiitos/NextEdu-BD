package com.example.nextedubd.enums;

public enum StatusCurso {

    RASCUNHO("Rascunho"),
    PUBLICADO("Publicado"),
    ARQUIVADO("Arquivado");

    private final String status;

    StatusCurso(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
}
