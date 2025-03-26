package com.maquinaturing.producto.concreto;

import com.maquinaturing.producto.abstracto.HaltChecker;
import com.maquinaturing.producto.abstracto.Programa;
import com.maquinaturing.producto.abstracto.Programa;
import static java.rmi.server.LogStream.log;

public class HaltCheckerImpl extends HaltChecker {
    @Override
    public boolean analizar(Programa programa, Programa entrada) {
        log("Simulando análisis de parada...");
        return !(programa instanceof ContadorSubida);
    }
}
