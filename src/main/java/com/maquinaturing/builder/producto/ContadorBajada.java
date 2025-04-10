package com.maquinaturing.builder.producto;

public class ContadorBajada extends Programa {
    private int inicio = 10;

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    @Override
    public void ejecutar() {
        for (int i = inicio; i >= 0; i--) {
            System.out.println("Contador Bajada: " + i);
        }
    }
}
