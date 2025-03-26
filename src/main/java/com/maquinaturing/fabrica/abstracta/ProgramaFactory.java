package com.maquinaturing.fabrica.abstracta;

import com.maquinaturing.producto.abstracto.HaltChecker;
import com.maquinaturing.producto.abstracto.Programa;

 public interface ProgramaFactory {

    Programa crearPrograma();
    HaltChecker crearHaltChecker();

}
