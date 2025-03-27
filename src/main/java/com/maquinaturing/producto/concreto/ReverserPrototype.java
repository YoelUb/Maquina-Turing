package com.maquinaturing.producto.concreto;

import com.maquinaturing.producto.abstracto.HaltChecker;
import com.maquinaturing.producto.abstracto.Programa;

public class ReverserPrototype implements Programa {
    private final HaltChecker checker;
    private final Programa programa;

    public ReverserPrototype(HaltChecker checker, Programa programa) {
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
        throw new UnsupportedOperationException("ReverserPrototype no puede decidir si se detiene");
    }
}
