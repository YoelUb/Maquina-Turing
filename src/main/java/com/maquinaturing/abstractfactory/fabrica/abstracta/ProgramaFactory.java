package com.maquinaturing.abstractfactory.fabrica.abstracta;

import com.maquinaturing.abstractfactory.producto.abstracto.HaltChecker;
import com.maquinaturing.abstractfactory.producto.abstracto.Programa;

 public interface ProgramaFactory {

    Programa crearPrograma();
    HaltChecker crearHaltChecker();

}
