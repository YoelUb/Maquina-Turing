package com.maquinaturing.producto.concreto;

import com.maquinaturing.producto.abstracto.ProgramaPrototype;
import com.maquinaturing.prototype.ProgramaPrototypeRegistry;

public class ContadorSubidaPrototype extends ProgramaPrototype {
    @Override
    public void ejecutar(String cinta) {
        int num = 1;
        while (num != 0) {
            System.out.println(num);
            num++;
        }
    }


    @Override
    public ProgramaPrototype clone() {
        return new ContadorSubidaPrototype();
    }
}