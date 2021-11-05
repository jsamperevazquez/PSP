package hilos.ejercicio7;

/**
 * Creado por @autor: Usuario
 * El 05/11/2021
 **/
public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Buzon escribir = new Buzon("Escribir");
        Buzon leer = new Buzon("Leer");

        escribir.escribirMensaje("Hola Don Pepito");
        leer.leerMensaje();
        escribir.escribirMensaje("Adiós Don José");
        leer.leerMensaje();

    }
}
