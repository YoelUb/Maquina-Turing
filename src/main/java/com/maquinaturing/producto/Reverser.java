package com.maquinaturing.producto;

public class Reverser extends Programa {
    private String cadena = "";

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    @Override
    public void ejecutar() {
        StringBuilder sb = new StringBuilder(cadena);
        System.out.println("Reverser: " + sb.reverse().toString());
    }
}
