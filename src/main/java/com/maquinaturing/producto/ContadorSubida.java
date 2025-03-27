package com.maquinaturing.producto;

public class ContadorSubida extends Programa {
    private int limite = 5;

    public void setLimite(int limite) {
        this.limite = limite;
    }

    @Override
    public void ejecutar() {
        for (int i = 0; i <= limite; i++) {
            System.out.println("Contador Subida: " + i);
        }
    }
}
