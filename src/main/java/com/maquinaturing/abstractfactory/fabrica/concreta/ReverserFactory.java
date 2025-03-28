package com.maquinaturing.abstractfactory.fabrica.concreta;

import com.maquinaturing.abstractfactory.fabrica.abstracta.ProgramaFactory;
import com.maquinaturing.abstractfactory.producto.abstracto.HaltChecker;
import com.maquinaturing.abstractfactory.producto.abstracto.Programa;
import com.maquinaturing.abstractfactory.producto.concreto.ContadorSubida;
import com.maquinaturing.abstractfactory.producto.concreto.HaltCheckerImpl;
import com.maquinaturing.abstractfactory.producto.concreto.Reverser;

public class ReverserFactory implements ProgramaFactory {
    @Override
    public Programa crearPrograma() {
        Programa p = new ContadorSubida();
        HaltChecker h = crearHaltChecker();
        return new Reverser(h, p);
    }

    @Override
    public HaltChecker crearHaltChecker() {
        return new HaltCheckerImpl();
    }
}
