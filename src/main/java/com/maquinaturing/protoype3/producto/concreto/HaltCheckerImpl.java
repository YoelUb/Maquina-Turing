package com.maquinaturing.protoype3.producto.concreto;

import com.maquinaturing.protoype3.producto.abstracto.HaltChecker;
import com.maquinaturing.protoype3.producto.abstracto.ProgramaPrototype;


public class HaltCheckerImpl extends HaltChecker {
    @Override
    public boolean analizar(ProgramaPrototype programa) {
        log("Simulando análisis de parada...");
        return !(programa instanceof ContadorSubidaPrototype);
    }

    private void log(String mensaje) {
        System.out.println("[HaltChecker] " + mensaje);
    }
}
