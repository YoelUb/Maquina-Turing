package com.maquinaturing.producto.concreto;

import com.maquinaturing.producto.abstracto.ProgramaPrototype;
import com.maquinaturing.prototype.ProgramaPrototypeRegistry;

public class ContadorSubidaPrototype extends com.maquinaturing.producto.abstracto.ProgramaPrototype {
    @Override
    public void ejecutar() {
        int num = 1;
        while (num != 0) {
            System.out.println(num);
            num++;
        }
    }

    @Override
    public boolean seDetiene(){

        return false;
    }
}