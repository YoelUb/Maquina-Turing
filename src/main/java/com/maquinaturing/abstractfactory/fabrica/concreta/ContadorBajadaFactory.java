package com.maquinaturing.abstractfactory.fabrica.concreta;

import com.maquinaturing.abstractfactory.fabrica.abstracta.ProgramaFactory;
import com.maquinaturing.abstractfactory.producto.abstracto.HaltChecker;
import com.maquinaturing.abstractfactory.producto.abstracto.Programa;
import com.maquinaturing.abstractfactory.producto.concreto.ContadorBajada;
import com.maquinaturing.abstractfactory.producto.concreto.HaltCheckerImpl;

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
