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

Ejecutar desde IntelliJ IDEA
Asegúrate de que LauncherApp.java es tu clase principal.

Usa el plugin javafx-maven-plugin.

Click derecho > Run LauncherApp.main().

🧩 ¿Qué hace la app?
Al iniciar, la interfaz JavaFX te permite elegir uno de los tres patrones de creación. Luego puedes seleccionar el tipo de programa:

✅ Contador de subida

✅ Contador de bajada

✅ Reverser (Prototype)

Cada patrón genera el mismo comportamiento observable pero con un enfoque de diseño distinto.

🧠 Patrones de diseño implementados
Abstract Factory
Crea familias de objetos relacionados (Programa y HaltChecker).

Ubicación: abstractfactory/fabrica/...

Builder
Construye paso a paso un programa (configurable).

Ubicación: builder3/builder, builder3/director, builder3/producto

Prototype
Clona programas existentes desde un registro.

Ubicación: protoype3/producto/...

Registro de prototipos: ProgramaPrototypeRegistry

🎮 Programas disponibles
Cada patrón puede ejecutar diferentes programas simulados:

Contador de bajada → cuenta de 10 a 0

Contador de subida → (limitado a evitar bucle infinito)

Reverser → invierte una cadena dada

📁 Estructura del proyecto
css
Copiar
Editar
src/main/java/com/maquinaturing/
├── abstractfactory/
├── builder3/
├── protoype3/
├── app/
└── Main.java
