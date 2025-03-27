package com.maquinaturing.producto.concreto;

import com.maquinaturing.producto.abstracto.Programa;

public class ContadorBajadaPrototype implements Programa {
    @Override
    public void ejecutar() {
        int num = 10;
        while (num != 0) {
            System.out.println(num);
            num--;
        }
    }

    @Override
    public boolean seDetiene(){

        return false;
    }
}