package com.example.nextedubd.entities;

import com.example.nextedubd.enums.TipoUsuario;

public class Desenvolvedor extends Usuario{


    public Desenvolvedor() {
        super();
        setTipoUsuario(TipoUsuario.DEV);
    }
}
