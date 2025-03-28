package com.maquinaturing.builder3.producto;

import java.util.concurrent.*;

public class HaltCheckerImpl {
    private Programa programa;

    public HaltCheckerImpl(Programa programa) {
        this.programa = programa;
    }

    public boolean verifica() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future = executor.submit(() -> programa.ejecutar());

        try {
            future.get(2, TimeUnit.SECONDS);  // Timeout real
            System.out.println("✅ Se detuvo.");
            return true;
        } catch (TimeoutException e) {
            System.out.println("❌ Timeout: posible bucle infinito.");
            future.cancel(true);
            return false; // <- importante!
        } catch (ExecutionException | InterruptedException e) {
            System.out.println("❌ Error en la ejecución: " + e.getMessage());
            return false;
        } finally {
            executor.shutdownNow();
        }
    }

}
