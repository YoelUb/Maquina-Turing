package com.maquinaturing.app;

import com.maquinaturing.abstractfactory.producto.abstracto.Programa;
import com.maquinaturing.builder.builder.ProgramaBuilder;
import javafx.application.Application;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextArea;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
        List<String> opciones = Arrays.asList("Contador de subida", "Contador de bajada");
        ChoiceDialog<String> dialog = new ChoiceDialog<>("Contador de bajada", opciones);
        dialog.setTitle("Seleccionar tipo de programa");
        dialog.setHeaderText("Abstract Factory - ¿Qué programa quieres ejecutar?");
        dialog.setContentText("Elige una opción:");

        Optional<String> resultado = dialog.showAndWait();
        if (resultado.isEmpty()) return;

        output.setText("Ejecutando Abstract Factory...\n");

        Programa programa;
        if (resultado.get().equals("Contador de subida")) {
            var factory = new com.maquinaturing.abstractfactory.fabrica.concreta.ContadorSubidaFactory();
            programa = factory.crearPrograma();
        } else {
            var factory = new com.maquinaturing.abstractfactory.fabrica.concreta.ContadorBajadaFactory();
            programa = factory.crearPrograma();
        }

        // Capturar System.out
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream oldOut = System.out;
        System.setOut(ps);

        programa.ejecutar();

        System.out.flush();
        System.setOut(oldOut);

        output.appendText(baos.toString());
    }


    private void runBuilder() {
        List<String> opciones = Arrays.asList("Contador de subida", "Contador de bajada");
        ChoiceDialog<String> dialog = new ChoiceDialog<>("Contador de bajada", opciones);
        dialog.setTitle("Seleccionar tipo de programa");
        dialog.setHeaderText("Builder - ¿Qué programa quieres ejecutar?");
        dialog.setContentText("Elige una opción:");

        Optional<String> resultado = dialog.showAndWait();
        if (resultado.isEmpty()) return;

        output.setText("Ejecutando Builder...\n");

        ProgramaBuilder builder;
        if (resultado.get().equals("Contador de subida")) {
            builder = new com.maquinaturing.builder.builder.ContadorSubidaBuilder();
        } else {
            builder = new com.maquinaturing.builder.builder.ContadorBajadaBuilder();
        }

        var director = new com.maquinaturing.builder.director.ProgramaDirector();
        director.setBuilder(builder);
        var programa = director.construirPrograma();

        // Capturar System.out
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream oldOut = System.out;
        System.setOut(ps);

        programa.ejecutar();

        System.out.flush();
        System.setOut(oldOut);

        output.appendText(baos.toString());
    }



    private void runPrototype() {
        List<String> opciones = Arrays.asList("Contador de subida", "Contador de bajada");
        ChoiceDialog<String> dialog = new ChoiceDialog<>("Contador de bajada", opciones);
        dialog.setTitle("Seleccionar tipo de programa");
        dialog.setHeaderText("Prototype - ¿Qué programa quieres ejecutar?");
        dialog.setContentText("Elige una opción:");

        Optional<String> resultado = dialog.showAndWait();
        if (resultado.isEmpty()) return;

        output.setText("Ejecutando Prototype...\n");

        com.maquinaturing.protoype.prototype.ProgramaPrototypeRegistry.registrar(
                "subida", new com.maquinaturing.protoype.producto.concreto.ContadorSubidaPrototype());
        com.maquinaturing.protoype.prototype.ProgramaPrototypeRegistry.registrar(
                "bajada", new com.maquinaturing.protoype.producto.concreto.ContadorBajadaPrototype());

        String clave = resultado.get().toLowerCase().split(" ")[2];
        var prototipo = com.maquinaturing.protoype.prototype.ProgramaPrototypeRegistry.obtener(clave);

        if (prototipo == null) {
            output.appendText("Prototipo no encontrado.\n");
            return;
        }

        // Capturar System.out
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream oldOut = System.out;
        System.setOut(ps);

        if (clave.equals("reverser")) {
            prototipo.ejecutar("abcde");
        } else {
            prototipo.ejecutar("10");
        }

        System.out.flush();
        System.setOut(oldOut);

        output.appendText(baos.toString());
    }





}
