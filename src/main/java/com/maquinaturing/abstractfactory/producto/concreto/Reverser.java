package com.maquinaturing.abstractfactory.producto.concreto;

import com.maquinaturing.abstractfactory.producto.abstracto.HaltChecker;
import com.maquinaturing.abstractfactory.producto.abstracto.Programa;

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

    @Override
    public boolean seDetiene() {
        throw new UnsupportedOperationException("Reverser no puede decidir si se detiene");
    }
}
