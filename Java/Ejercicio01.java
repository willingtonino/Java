import java.util.Scanner;

public class Ejercicio01 {
    private static Scanner reader;

    public static void main(String args[]) {
        reader = new Scanner(System.in);
        int v1 = 0;
        int v2 = 0;
        int mult3 = 0;
        int mult5 = 0;

        System.out.println("Ingresa en primer numero: ");
        v1 = reader.nextInt();

        System.out.println("Ingresa en segundo numero: ");
        v2 = reader.nextInt();
        mult3 = 0;
        mult5 = 0;

        if (v1 == 0) {
            v1 = 1;
        }
        while (v1 <= v2) {
            if (v1 % 3 == 0) {
                mult3 += 1;
            }

            if (v1 % 5 == 0) {
                mult5 += 1;
            }
            v1 += 1;
        }
        System.out.printf("multiplos de 3 en el rango: %d", mult3);
        System.out.printf("\nmultiplos de 5 en el rango: %d \n", mult5);
    }
}
