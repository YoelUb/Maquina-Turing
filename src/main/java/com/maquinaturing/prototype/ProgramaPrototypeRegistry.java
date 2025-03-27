
package com.maquinaturing.prototype;

import com.maquinaturing.producto.abstracto.ProgramaPrototype;

import java.util.HashMap;
import java.util.Map;

public class ReverserPrototype extends ProgramaPrototype {

    @Override
    public void ejecutar(String cinta) {
        StringBuilder builder = new StringBuilder(cinta);
        System.out.println("Cadena invertida: " + builder.reverse());
    }
}
