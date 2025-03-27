package com.maquinaturing.app;


import com.maquinaturing.builder.ProgramaBuilder;
import com.maquinaturing.builder.ReverserBuilder;
import com.maquinaturing.director.ProgramaDirector;
import com.maquinaturing.producto.HaltCheckerImpl;
import com.maquinaturing.producto.Programa;

public class Main {
    public static void main(String[] args) {

        ProgramaBuilder builder = new ReverserBuilder();
        ProgramaDirector director = new ProgramaDirector();
        director.setBuilder(builder);
        Programa programa = director.construirPrograma();

        HaltCheckerImpl checker = new HaltCheckerImpl(programa);
        boolean seDetuvo = checker.verifica();
        if(seDetuvo){
            System.out.println("¿Se detuvo?: Si");
        }else{
            System.out.println("¿Se detuvo?: No");
        }


    }
}
