import java.util.Scanner;

public class Ejercicio02 {
    private static Scanner reader;

    public static void main(String args[]) {
        reader = new Scanner(System.in);
        int v1 = 0;
        int v2 = 0;
        int par = 0;
        int impar = 0;

        System.out.println("Ingresa el primer numero: ");
        v1 = reader.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        v2 = reader.nextInt();
        par = 0;
        impar = 0;

        while (v1 <= v2) {
            if (v1 % 2 == 0) {
                par += v1;
            }

            if (v1 % 2 != 0) {
                impar += v1;
            }

            v1 += 1;
        }

        System.out.printf("La sumatoria de pares en el rango es de: %d ", par);
        System.out.printf("\nLa sumatoria de impares en el rango es de: %d \n", impar);
    }
}
