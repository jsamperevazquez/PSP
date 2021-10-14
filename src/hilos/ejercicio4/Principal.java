package hilos.ejercicio4;

/**
 * Creado por @autor: Usuario
 * El 14/10/2021
 **/
public class Principal {
    public static void main(String[] args) {
        Hilos hilo = new Hilos("HiloPares");
        Hilo2 hilo2 = new Hilo2("HiloImpares");
        Hilo3 hilo3 = new Hilo3("HiloDosTres");
        System.out.println("*** Empieza el programa ***");
        hilo.start();
        hilo2.start();
        hilo3.start();
    }
}
