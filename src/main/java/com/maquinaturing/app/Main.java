package com.maquinaturing.app;

import com.maquinaturing.producto.abstracto.Programa;

public class Main {
    public static void main(String[] args) {


        ProgramaFactory factory = new ReverserFactory();
        Programa programa = factory.crearPrograma();
        programa.ejecutar();

    }
}