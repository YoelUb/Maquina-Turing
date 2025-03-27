package com.maquinaturing.app;

import com.maquinaturing.producto.abstracto.ProgramaPrototype;

import com.maquinaturing.producto.concreto.ContadorBajadaPrototype;
import com.maquinaturing.producto.concreto.ContadorSubidaPrototype;
import com.maquinaturing.producto.concreto.ReverserPrototype;
import com.maquinaturing.prototype.ProgramaPrototypeRegistry;



public class Main {
    public static void main(String[] args) {
        // Registrar prototipos
        ProgramaPrototypeRegistry.registrar("subida", new ContadorSubidaPrototype());
        ProgramaPrototypeRegistry.registrar("bajada", new ContadorBajadaPrototype());
        ProgramaPrototypeRegistry.registrar("reverser", new ReverserPrototype());

        // Clonar y ejecutar programas
        ProgramaPrototype bajada = ProgramaPrototypeRegistry.obtener("bajada");
        bajada.ejecutar("10");

        ProgramaPrototype reverser = ProgramaPrototypeRegistry.obtener("reverser");
        reverser.ejecutar("abc");

        ProgramaPrototype subida = ProgramaPrototypeRegistry.obtener("subida");
        // Linea comentada para que el programa no sea infinito:
        // subida.ejecutar("10");

    }
}
