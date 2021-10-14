package hilos.ejercicio1;

/**
 * Creado por @autor: Usuario
 * El 14/10/2021
 **/
public class Principal {
    public static void main(String[] args) {
        Hilos hilo1 = new Hilos("Hilo1");
        hilo1.setPriority(1);
        hilo1.start();
        Hilos hilo2 = new Hilos("Hilo2");
        hilo2.setPriority(10);
        hilo2.start();
    }
}
