import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static Scanner leer = new Scanner(System.in);
    public static Scanner leerd = new Scanner(System.in);
    public static ArrayList<Double> lista = new ArrayList<Double>();

    public static double promedio(double x, double y) {
        double result;
        result = x / y;
        return result;

    }

    public static void main(String[] args) {
        double notas;
        int n = 0;
        double sumatoria = 0;

        System.out.println("¿Cuantas notas desea ingresar?");
        int numero = leer.nextInt();

        do {
            System.out.println("Ingrese un número: ");
            notas = leerd.nextDouble();
            lista.add(notas);
            n += 1;
        } while (n < numero);
        System.out.println("Los elementos en la lista son: " + lista);

        int numeroele = lista.size();

        for (int i = 0; i < lista.size(); i++) {
            sumatoria += lista.get(i);
        }
        double resultado = promedio(sumatoria, numeroele);
        System.out.println("El promedio de las notas es:"+String.format("%.2f",resultado));
    }
}