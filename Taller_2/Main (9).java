import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static Scanner leer = new Scanner(System.in);
    public static Scanner leerd = new Scanner(System.in);
    public static ArrayList<Float> lista = new ArrayList<Float>();
    
    public static float promedio(ArrayList <Float> lista) {
        float sumatoria=0;
        int numeroele=0;
        int c=0;
        float result;
        numeroele = lista.size();
        
        for (int i = 0; i < numeroele; i++) {
            sumatoria += lista.get(c);
            c+=1;
            }
        result = sumatoria / numeroele;
        
        return result;
    }

    public static void main(String[] args) {
        float notas;
        int n = 0;

        System.out.println("¿Cuantas notas desea ingresar?");
        int numero = leer.nextInt();

        do {
            System.out.println("Ingrese un número: ");
            notas = leerd.nextFloat();
            lista.add(notas);
            n += 1;
        } while (n < numero);
        System.out.println("Los elementos en la lista son: " + lista);

      
        float resultado = promedio(lista);
        System.out.println("El promedio de las notas es:"+String.format("%.2f",resultado));
    }
}