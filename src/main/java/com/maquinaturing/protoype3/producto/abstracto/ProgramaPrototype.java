package com.maquinaturing.protoype3.producto.abstracto;

public abstract class ProgramaPrototype implements Cloneable {

    public abstract void ejecutar(String cinta);

    @Override
    public ProgramaPrototype clone() {
        try {
            return (ProgramaPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
