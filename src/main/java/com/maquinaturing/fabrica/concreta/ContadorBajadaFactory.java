package com.maquinaturing.fabrica.concreta;

import com.maquinaturing.fabrica.abstracta.ProgramaFactory;
import com.maquinaturing.producto.abstracto.HaltChecker;
import com.maquinaturing.producto.abstracto.Programa;
import com.maquinaturing.producto.concreto.ContadorBajada;
import com.maquinaturing.producto.concreto.HaltCheckerImpl;

public class ContadorBajadaFactory implements ProgramaFactory {
    @Override
    public Programa crearPrograma() {
        return new ContadorBajada();
    }

    @Override
    public HaltChecker crearHaltChecker() {
        return new HaltCheckerImpl();
    }
}
