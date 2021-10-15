package hilos.ejercicio5;

/**
 * Creado por @autor: Usuario
 * El 15/10/2021
 **/
public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Hilos hilo1 = new Hilos("número1");
        Hilos hilo2 = new Hilos("número2");
        hilo2.setPriority(10);
        hilo2.start();
        hilo2.join();
        hilo1.start();


    }
}
