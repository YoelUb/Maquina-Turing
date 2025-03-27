package com.maquinaturing.producto.abstracto;

public abstract ProgramaPrototype  implements Cloneable {

    public abstract void ejecutar(String cinta);
}


    @Override
    public ProgramaPrototype clone() {
        try {
            return (ProgramaPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
