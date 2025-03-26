package com.maquinaturing.app;

import com.maquinaturing.fabrica.abstracta.ProgramaFactory;
import com.maquinaturing.fabrica.concreta.ContadorBajadaFactory;
import com.maquinaturing.fabrica.concreta.ReverserFactory;
import com.maquinaturing.producto.abstracto.Programa;

public class Main {
    public static void main(String[] args) {


        ProgramaFactory factory = new ContadorBajadaFactory();
        Programa programa = factory.crearPrograma();
        programa.ejecutar();

    }
}