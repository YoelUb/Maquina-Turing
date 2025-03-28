package com.maquinaturing.abstractfactory.producto.concreto;

import com.maquinaturing.abstractfactory.producto.abstracto.Programa;

public class ContadorBajada implements Programa {
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