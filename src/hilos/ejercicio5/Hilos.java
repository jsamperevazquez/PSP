package hilos.ejercicio5;

/**
 * Creado por @autor: Usuario
 * El 15/10/2021
 **/
public class Hilos extends Thread {
    public Hilos(String nombre){
        super(nombre);
    }

    @Override
    public void run() {
        System.out.println("Ola, son o fío " + getName() + " con prioridad-> " + getPriority());
    }
}
