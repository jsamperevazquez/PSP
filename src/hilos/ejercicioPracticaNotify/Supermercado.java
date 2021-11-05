package hilos.ejercicioPracticaNotify;

import java.util.Random;

/**
 * Creado por @autor: Usuario
 * El 29/10/2021
 **/
public class Supermercado extends Thread {
    // Declaramos las variables estáticas poder compartirlas
    private final static int topeMaximo = 8;
    private static int contadorGente;
    private static boolean disponible = true;
    Random random = new Random();
    int valores = random.nextInt(600) + 100;
    public Supermercado(String name) {
        super(name);
    }

    @Override
    public void run() {
    }

    public synchronized int entrada() throws InterruptedException {
        while (!disponible && contadorGente <= topeMaximo) {
            sleep(valores);
            System.out.println("El hilo " + getName() + " se queda en la cola");
            wait();
        }
        disponible = false; // Digo que estoy yo modificando y realizando código
        contadorGente ++;
        System.out.println("El hilo " + getName() + " entra \n" + contadorGente );
        disponible = true; // Libero el proceso y digo que está libre
        return contadorGente;
    }

    public synchronized int salida() throws InterruptedException {
        disponible = false; // Voy a realizar cambios y digo que estoy yo aquí
        System.out.println(getName() + " está dentro");
        sleep(valores);
        contadorGente --;
        System.out.println(contadorGente);
        disponible = true; // Libero el proceso y digo que está libre
        notify(); // Despiertas el siguiente hilo
        System.out.println(getName() + " ha salido");
        return contadorGente;
    }
}
