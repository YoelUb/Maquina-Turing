package com.maquinaturing.abstractfactory.producto.concreto;

import com.maquinaturing.abstractfactory.producto.abstracto.HaltChecker;
import com.maquinaturing.abstractfactory.producto.abstracto.Programa;


public class HaltCheckerImpl extends HaltChecker {
    @Override
    public boolean analizar(Programa programa, Programa entrada) {
        log("Simulando análisis de parada...");
        return !(programa instanceof ContadorSubida);
    }

    private void log(String mensaje) {
        System.out.println("[HaltChecker] " + mensaje);
    }
}
