package com.maquinaturing.producto.concreto;

import com.maquinaturing.producto.abstracto.Programa;

public class ContadorBajada implements Programa {
    @Override
    public void ejecutar() {
        int num = 10;
        while (num != 0) {
            System.out.println(num);
            num--;
        }
    }
}