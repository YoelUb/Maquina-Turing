package com.maquinaturing.producto.abstracto;

public interface ProgramaPrototype  implements Cloneable {

    void ejecutar();
    boolean seDetiene();
}


    @Override
    public ProgramaPrototype clone() {
        try {
            return (ProgramaPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
