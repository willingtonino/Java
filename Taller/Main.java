package Taller;

import java.util.Scanner;

public class Main {
    // public Gato gato;
    public static Scanner leer = new Scanner(System.in);
    public static Scanner leerL = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hola jugador");
        String raza1;
        String color1;
        int energia1;
        int nivelalimento1;

        System.out.println("Raza de tu gato: ");
        raza1 = leer.nextLine();

        System.out.println("Color de tu gato:");
        color1 = leer.nextLine();

        System.out.println("Energia de tu gato:");
        energia1 = leer.nextInt();

        System.out.println("Nivel de alimentacion de tu gato:");
        nivelalimento1 = leer.nextInt();

        Gato gato = new Gato(raza1, color1, energia1, nivelalimento1);

        boolean terminar = true;
        do {

            System.out.println("\n" + "¿Qué quiere hacer?" + "\n" + "1 Dar comida a tu gato" + "\n"
                    + "2 Dejar dormir para que recupere energia tu gato" + "\n" + "3 Jugar con el gato" + "\n"
                    + "4 acariciar" + "\n" + "5 Nada");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("¿Cuantos trozos de carne quieres dar al gato?" + "\n"
                            + "La cantidad maxima de trozos que podria comer son 10");
                    int comer = leerL.nextInt();
                    gato.comer(comer);
                    break;
                case 2:
                    System.out.println("¿Cuantas horas dejar dormir al gato?" + "\n"
                            + "las horas maximas que podria dormir son 8");
                    int horas = leerL.nextInt();
                    gato.dormir(horas);
                    break;

                case 3:
                    System.out.println("Cuantas veces quieres jugar con el gato");
                    int juego = leerL.nextInt();
                    gato.jugar(juego);
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