package com.maquinaturing.protoype3.producto.concreto;

import com.maquinaturing.protoype3.producto.abstracto.ProgramaPrototype;

public class ContadorBajadaPrototype extends ProgramaPrototype {

    @Override
    public void ejecutar(String cinta) {
        int numero = Integer.parseInt(cinta);
        while (true) {
            numero--;
            System.out.println("Contador bajando: " + numero);
            if (numero < -10) break;
        }
    }

    @Override
    public ProgramaPrototype clone() {
        return new ContadorBajadaPrototype();
    }
}
