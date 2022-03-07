package Taller;

import java.util.Scanner;

public class Main {
    public Gato gato;
    public Scanner leer = new Scanner(System.in);
    public static Scanner leerL = new Scanner(System.in);

    public Main() {

        gato = new Gato();
        // public static Scanner leer = new Scanner(System.in);

        preraza();
        color();
        prenergia();
        alimentacion();
    }

    public void preraza() {
        System.out.println("Raza de tu gato: ");
        String raza = leer.nextLine();
        gato.raza(raza);
    }

    public void color() {
        System.out.println("Color de tu gato:");
        String color = leer.nextLine();
        gato.setColor(color);
    }

    public void prenergia() {
        System.out.println("Energia de tu gato:");
        int energia = leer.nextInt();
        gato.energia(energia);
    }

    public void alimentacion() {
        System.out.println("Nivel de alimentacion de tu gato:");
        int nivelalimento = leer.nextInt();
        gato.nivelalimento(nivelalimento);
    }

    public int hacer() {
        System.out.println("¿Qué quiere hacer?" + "\n" + "1 Dar comida a tu gato" + "\n"
                + "2 Dejar dormir para que recupere energia tu gato" + "\n" + "3 Jugar con el gato" + "\n"
                + "4 acariciar" + "\n" + "5 Nada");
        int opcion = leer.nextInt();
        return opcion;
    }

    public static void main(String[] args) {
        System.out.println("Hola amo");
        Main accion = new Main();
        boolean terminar = true;
        do {
            int opcion = accion.hacer();
            switch (opcion) {
                case 1:

                    System.out.println("¿Cuantos gramos de comida dar al gato?" + "\n"
                            + "Dar en gramos de 10 en 10 con maximo de 100 gr");
                    int comer = leerL.nextInt();
                    accion.gato.comer(comer);
                    break;
                case 2:
                    System.out.println("¿Cuantas horas dejar dormir al gato?");
                    int horas = leerL.nextInt();
                    accion.gato.dormir(horas);
                    break;

                case 3:
                    accion.gato.jugar();
                    break;
                case 4:
                    System.out.println("Estas acariciando al gato" + "\n" + "......." + "\n" + "......." + "\n");
                    break;

                case 5:
                    terminar = false;
                    break;

                default:
                    System.out.println("Opcion invalida");

            }

        } while (terminar);

    }
}