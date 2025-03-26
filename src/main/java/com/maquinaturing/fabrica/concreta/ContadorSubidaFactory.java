package com.maquinaturing.fabrica.concreta;

import com.maquinaturing.fabrica.abstracta.ProgramaFactory;
import com.maquinaturing.producto.abstracto.HaltChecker;
import com.maquinaturing.producto.abstracto.Programa;
import com.maquinaturing.producto.concreto.ContadorSubida;
import com.maquinaturing.producto.concreto.HaltCheckerImpl;

public class ContadorSubidaFactory implements ProgramaFactory {
    @Override
    public Programa crearPrograma() {
        return new ContadorSubida();
    }

    @Override
    public HaltChecker crearHaltChecker() {
        return new HaltCheckerImpl();
    }
}
