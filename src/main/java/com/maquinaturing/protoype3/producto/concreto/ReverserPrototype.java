package com.maquinaturing.protoype3.producto.concreto;

import com.maquinaturing.protoype3.producto.abstracto.ProgramaPrototype;


public class ReverserPrototype extends ProgramaPrototype {

    @Override
    public void ejecutar(String cinta) {
        StringBuilder builder = new StringBuilder(cinta);
        System.out.println("Cadena invertida: " + builder.reverse());
    }

    @Override
    public ProgramaPrototype clone() {
        return new ReverserPrototype();
    }

}
