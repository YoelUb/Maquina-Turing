package com.maquinaturing.abstractfactory.fabrica.concreta;

import com.maquinaturing.abstractfactory.fabrica.abstracta.ProgramaFactory;
import com.maquinaturing.abstractfactory.producto.abstracto.HaltChecker;
import com.maquinaturing.abstractfactory.producto.abstracto.Programa;
import com.maquinaturing.abstractfactory.producto.concreto.ContadorSubida;
import com.maquinaturing.abstractfactory.producto.concreto.HaltCheckerImpl;

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
