package hilos.ejercicio2;

/**
 * Creado por @autor: Usuario
 * El 14/10/2021
 **/
public class Principal {
    public static void main(String[] args) {
        Hilos hilo1 = new Hilos("Hilo1");
        Hilos hilo2 = new Hilos("Hilo2");
        Hilos hilo3 = new Hilos("Hilo3");
        Hilos hilo4 = new Hilos("Hilo4");
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}
