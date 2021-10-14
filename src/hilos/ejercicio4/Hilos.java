package hilos.ejercicio4;

/**
 * Creado por @autor: Usuario
 * El 14/10/2021
 **/
public class Hilos extends Thread {
    public Hilos(String nombreHilo) {
        super(nombreHilo);
    }

    @Override
    public void run() {
        int acumuladorPares = 0;
        for (int i = 1; i < 1001; i++) {
            if (i % 2 == 0) {
                acumuladorPares += i;
                System.out.println("Nombre: " + getName() + " " + acumuladorPares);
            }
        }
    }
}

class Hilo2 extends Thread {
    public Hilo2(String nombreHilo) {
        super(nombreHilo);
    }

    @Override
    public void run() {
        int acumuladorImPares = 0;
        for (int i = 0; i < 1001; i++) {
            if (i % 2 != 0) {
                acumuladorImPares += i;
                System.out.println("Nombre: " + getName() + " " + acumuladorImPares);

            }
        }
    }
}

class Hilo3 extends Thread {
    public Hilo3(String nombreHilo) {
        super(nombreHilo);
    }

    @Override
    public void run() {
        int acumuladorDosTres = 0;

        for (int i = 0; i < 1001; i++) {
            if (i % 10 == 2 || i % 10 == 3) { // módulo de división por 10 coger último dígito de i
                acumuladorDosTres += i;
                System.out.println("Nombre: " + getName() + " " + acumuladorDosTres);

            }
        }
    }
}