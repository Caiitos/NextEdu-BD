package com.example.nextedubd.enums;

public enum StatusMatricula {

    ATIVA("Ativa"),
    CONCLUIDA("Concluída"),
    CANCELADA("Cancelada");

    private final String status;

    StatusMatricula(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
