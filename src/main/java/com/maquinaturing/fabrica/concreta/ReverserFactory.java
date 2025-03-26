package com.maquinaturing.fabrica.concreta;

import com.maquinaturing.fabrica.abstracta.ProgramaFactory;
import com.maquinaturing.producto.abstracto.HaltChecker;
import com.maquinaturing.producto.abstracto.Programa;
import com.maquinaturing.producto.concreto.ContadorBajada;
import com.maquinaturing.producto.concreto.ContadorSubida;
import com.maquinaturing.producto.concreto.HaltCheckerImpl;
import com.maquinaturing.producto.concreto.Reverser;

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
