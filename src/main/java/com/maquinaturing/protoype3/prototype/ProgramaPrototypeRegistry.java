package com.maquinaturing.protoype3.prototype;

import com.maquinaturing.protoype3.producto.abstracto.ProgramaPrototype;

import java.util.HashMap;
import java.util.Map;

public class ProgramaPrototypeRegistry {

    private static final Map<String, ProgramaPrototype> prototipos = new HashMap<>();

    public static void registrar(String clave, ProgramaPrototype prototipo) {
        prototipos.put(clave, prototipo);
    }

    public static ProgramaPrototype obtener(String clave) {
        ProgramaPrototype prototipo = prototipos.get(clave);
        return prototipo != null ? prototipo.clone() : null;
    }
}
