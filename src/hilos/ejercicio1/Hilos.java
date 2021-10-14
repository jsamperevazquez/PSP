package hilos.ejercicio1;

/**
 * Creado por @autor: Usuario
 * El 14/10/2021
 **/
public class Hilos extends Thread {
    public Hilos(String str){
        super(str);
    }
    @Override
    public void run() {
        for (int i = 0; i < 11 ; i++)
            System.out.println(i +" " + getName()); // Imprimo iteración y nombre del hilo

        System.out.println("Termina el hilo" + getName());
        try {
            Thread.sleep(1000); // Sleep para parar hilo 1 segundo = 1000 milisegundos
        } catch (InterruptedException e) {
            System.out.println("Error en interrupción");
        }
    }
}
