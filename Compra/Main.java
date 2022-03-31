import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static Scanner leer = new Scanner(System.in);
    public static Scanner leerl = new Scanner(System.in);
    public static Scanner leerf = new Scanner(System.in);
    public static HashMap diccionario = new HashMap();

    public static void main(String[] args) {
        String id1;
        int ref1;
        float valor1;
        String fecha1;
        int vip;
        int can;
        float pago;
        float total = 0;
        float ttotal = 0;
        int n = 0;
        ArrayList<Integer> dato = new ArrayList<>();
        System.out.println("ID");
        id1 = leerl.nextLine();
        System.out.println("fecha");
        fecha1 = leerl.nextLine();
        System.out.println("Vip\nDigita 1 o 2\n1)Si-----2)No");
        while (true) {
            vip = leer.nextInt();
            if (vip == 1 || vip == 2) {
                break;
            } else {
                System.out.println("Valor invalido\nDigita 1 o 2\n1)Si-----2)No");
            }

        }

        System.out.println("Cantidad de productos comprados");
        can = leer.nextInt();
        do {
            System.out.println("Referencia del producto " + (n + 1));
            ref1 = leer.nextInt();
            System.out.println("Valor del producto " + (n + 1) + " comprado");
            valor1 = leerf.nextFloat();
            Compra producto = new Compra(id1, ref1, valor1, fecha1);
            pago = producto.pagar(vip);
            total += pago;
            ttotal += valor1;
            dato.add(ref1);
            diccionario.put(ref1, pago);
            n += 1;

        } while (n < can);
        {
            for (int elemento : dato) {
                System.out.println("Referencia " + elemento + " paga: " + diccionario.get(elemento));
            }
            System.out.println("\nEl total a pagar es de " + total + " y el descuento fue de " + (ttotal - total));
        }

    }
}