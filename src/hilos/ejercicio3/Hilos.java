package hilos.ejercicio3;

import java.util.Random;

/**
 * Creado por @autor: Usuario
 * El 14/10/2021
 **/
public class Hilos extends Thread {

    int numeroHilo;

    public Hilos(String nombreHilo, int numeroH_Padre) {
        super(nombreHilo);
        numeroHilo = numeroH_Padre; // asigno el numero del hilo padre a variable hijo para controlar número
    }

    public int getNumeroHilo() {
        return numeroHilo;
    } // getter para devolver el número hilo

    @Override
    public void run() {
        Hilos hijo = null; // Instancio objeto de clase como nulo
        int nuevoHilo = numeroHilo + 1; // voy sumando uno a cada nueva instancia
        if (numeroHilo < 4) {
            System.out.println("Comienza hilo: " + getName() + " con identificador -> " + getNumeroHilo());
            hijo = new Hilos("Hijo de " + numeroHilo, nuevoHilo);
            hijo.start();
            Random random = new Random();
            int valores = random.nextInt(600) + 100; // sleep con random entre valores
            try {
                hijo.join();
            } catch (InterruptedException e) {
                System.out.println("Error en join");
            }
            System.out.println(" Nombre: " + getName() + " Sleep: " + valores);
            for (int i = 0; i < 10; i++) {
                System.out.println(" nombre: " + getName() + "; i=" + i);
                try {
                    sleep(valores);
                } catch (InterruptedException e) {
                    System.out.println("Error en pausa hilo");
                }
            }
            System.out.println("Terminado hilo " + getName());
        }

    }
}