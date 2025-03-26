package com.maquinaturing.producto.concreto;

import com.maquinaturing.producto.abstracto.HaltChecker;
import com.maquinaturing.producto.abstracto.Programa;

public class Reverser implements Programa {
    private final HaltChecker checker;
    private final Programa programa;

    public Reverser(HaltChecker checker, Programa programa) {
        this.checker = checker;
        this.programa = programa;
    }

    @Override
    public void ejecutar() {
        boolean seDetiene = checker.analizar(programa, programa);
        if (seDetiene) {
            while (true) {}
        } else {
            return;
        }
    }
}
