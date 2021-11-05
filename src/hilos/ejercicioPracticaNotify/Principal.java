package hilos.ejercicioPracticaNotify;

/**
 * Creado por @autor: Usuario
 * El 29/10/2021
 **/
public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Supermercado entrada = new Supermercado("Entrada");
        Supermercado salida = new Supermercado("Salida");
        entrada.entrada();
        salida.salida();
        entrada.entrada();

        salida.salida();
    }
}
