package com.maquinaturing.app;

import javafx.application.Application;
import javafx.scene.control.TextArea;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class LauncherApp extends Application {

    private TextArea output;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Selector de Patrón de Creación");

        Button btnAbstractFactory = new Button("Abstract Factory");
        Button btnBuilder = new Button("Builder");
        Button btnPrototype = new Button("Prototype");

        output = new TextArea();
        output.setEditable(false);
        output.setWrapText(true);

        btnAbstractFactory.setOnAction(e -> runAbstractFactory());
        btnBuilder.setOnAction(e -> runBuilder());
        btnPrototype.setOnAction(e -> runPrototype());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(btnAbstractFactory, btnBuilder, btnPrototype, output);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void runAbstractFactory() {
        output.setText("Ejecutando Abstract Factory...\n");

        var factory = new com.maquinaturing.abstractfactory.fabrica.concreta.ContadorBajadaFactory();
        var programa = factory.crearPrograma();

        // Redirigir la salida estándar (System.out) para capturarla
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.PrintStream ps = new java.io.PrintStream(baos);
        java.io.PrintStream oldOut = System.out;
        System.setOut(ps);

        programa.ejecutar(); // Esto imprimirá a la terminal, pero ahora será capturado

        System.out.flush();
        System.setOut(oldOut); // Restaurar salida estándar

        // Mostrar la salida capturada en el TextArea
        output.appendText(baos.toString());
    }

    private void runBuilder() {
        output.setText("Ejecutando Builder...\n");

        var builder = new com.maquinaturing.builder3.builder.ContadorBajadaBuilder();
        var director = new com.maquinaturing.builder3.director.ProgramaDirector();
        director.setBuilder(builder);
        var programa = director.construirPrograma();

        // Redirigir System.out
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.PrintStream ps = new java.io.PrintStream(baos);
        java.io.PrintStream oldOut = System.out;
        System.setOut(ps);

        programa.ejecutar();

        System.out.flush();
        System.setOut(oldOut);

        output.appendText(baos.toString());
    }


    private void runPrototype() {
        output.setText("Ejecutando Prototype...\n");

        com.maquinaturing.protoype3.prototype.ProgramaPrototypeRegistry.registrar(
                "bajada", new com.maquinaturing.protoype3.producto.concreto.ContadorBajadaPrototype());
        com.maquinaturing.protoype3.prototype.ProgramaPrototypeRegistry.registrar(
                "reverser", new com.maquinaturing.protoype3.producto.concreto.ReverserPrototype());

        // Redirigir System.out
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        java.io.PrintStream ps = new java.io.PrintStream(baos);
        java.io.PrintStream oldOut = System.out;
        System.setOut(ps);

        // Clonar y ejecutar programas
        var bajada = com.maquinaturing.protoype3.prototype.ProgramaPrototypeRegistry.obtener("bajada");
        if (bajada != null) bajada.ejecutar("10");

        var reverser = com.maquinaturing.protoype3.prototype.ProgramaPrototypeRegistry.obtener("reverser");
        if (reverser != null) reverser.ejecutar("abc");


        System.out.flush();
        System.setOut(oldOut);

        output.appendText(baos.toString());
    }




}
