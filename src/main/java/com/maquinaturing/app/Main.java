package com.maquinaturing.app;

import com.maquinaturing.producto.abstracto.ProgramaPrototype;

public class Main {
    public static void main(String[] args) {
        // Registrar prototipos
        ProgramaPrototypeRegistry.registrar("subida", new ContadorSubidaPrototype());
        ProgramaPrototypeRegistry.registrar("bajada", new ContadorBajadaPrototype());
        ProgramaPrototypeRegistry.registrar("reverser", new ReverserPrototype());

        // Clonar y ejecutar programas
        ProgramaPrototype subida = ProgramaPrototypeRegistry.obtener("subida");
        subida.ejecutar("123");

        ProgramaPrototype bajada = ProgramaPrototypeRegistry.obtener("bajada");
        bajada.ejecutar("321");

        ProgramaPrototype reverser = ProgramaPrototypeRegistry.obtener("reverser");
        reverser.ejecutar("abc");

    }
}

import com.maquinaturing.producto.concreto.ContadorBajadaPrototype;
import com.maquinaturing.producto.concreto.ContadorSubidaPrototype;
import com.maquinaturing.producto.concreto.ReverserPrototype;
import com.maquinaturing.prototype.ProgramaPrototypeRegistry;

