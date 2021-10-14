package hilos.ejercicio3;

/**
 * Creado por @autor: Usuario
 * El 14/10/2021
 **/
public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Hilos hiloPadre = new Hilos("Padre",0);
        System.out.println(" Creación de hilo padre");
        hiloPadre.start();
        hiloPadre.join();
        System.out.println("Termina programa");
    }
}
