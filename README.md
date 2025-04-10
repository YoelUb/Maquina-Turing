# 🧠 Máquina de Turing - Simulación con Patrones de Diseño

Este proyecto implementa una simulación conceptual del problema de parada de Turing utilizando tres patrones de creación clásicos:

- 🧱 **Builder**
- 🏭 **Abstract Factory**
- 🧬 **Prototype**

Además, se incluye una interfaz gráfica construida con **JavaFX**, desde la cual se puede seleccionar el patrón y el tipo de programa a ejecutar.

---

## 🚀 Cómo ejecutar el proyecto

### Requisitos

- Java 21+
- Maven 3.8+
- JavaFX configurado (ya incluido vía Maven)

## Ejecutar desde IntelliJ IDEA

Usa el plugin javafx-maven-plugin.

Click derecho > Run Main.main().

## 🧩 ¿Qué hace la app?
Al iniciar, la interfaz JavaFX te permite elegir uno de los tres patrones de creación. Luego puedes seleccionar el tipo de programa:

✅ Contador de subida

✅ Contador de bajada

✅ Reverser (Prototype)

Cada patrón genera el mismo comportamiento observable pero con un enfoque de diseño distinto.

## 🧠 Patrones de diseño implementados
**Abstract Factory**

- Crea familias de objetos relacionados (Programa y HaltChecker).

- Ubicación: abstractfactory/fabrica/...

**Builder**

- Construye paso a paso un programa (configurable).

- Ubicación: builder/builder, builder/director, builder/producto

**Prototype**

- Clona programas existentes desde un registro.

- Ubicación: protoype/producto/...

- Registro de prototipos: ProgramaPrototypeRegistry


## 📁 Estructura del proyecto

```txt
src/main/java/
└── com
    └── maquinaturing
        ├── abstractfactory
        │   ├── fabrica
        │   │   ├── abstracta
        │   │   │   └── ProgramaFactory.java
        │   │   └── concreta
        │   │       ├── ContadorBajadaFactory.java
        │   │       ├── ContadorSubidaFactory.java
        │   │       └── ReverserFactory.java
        │   └── producto
        │       ├── abstracto
        │       │   ├── HaltChecker.java
        │       │   └── Programa.java
        │       └── concreto
        │           ├── ContadorBajada.java
        │           ├── ContadorSubida.java
        │           ├── HaltCheckerImpl.java
        │           └── Reverser.java
        ├── app
        │   ├── LauncherApp.java
        │   └── Main.java
        ├── builder
        │   ├── builder
        │   │   ├── ContadorBajadaBuilder.java
        │   │   ├── ContadorSubidaBuilder.java
        │   │   ├── ProgramaBuilder.java
        │   │   └── ReverserBuilder.java
        │   ├── director
        │   │   └── ProgramaDirector.java
        │   └── producto
        │       ├── ContadorBajada.java
        │       ├── ContadorSubida.java
        │       ├── HaltCheckerImpl.java
        │       ├── Programa.java
        │       └── Reverser.java
        └── protoype
            ├── producto
            │   ├── abstracto
            │   │   ├── HaltChecker.java
            │   │   └── ProgramaPrototype.java
            │   └── concreto
            │       ├── ContadorBajadaPrototype.java
            │       ├── ContadorSubidaPrototype.java
            │       ├── HaltCheckerImpl.java
            │       └── ReverserPrototype.java
            └── prototype
                └── ProgramaPrototypeRegistry.java
```

