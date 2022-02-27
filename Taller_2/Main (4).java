import java.util.Scanner;
public class Main{
    public static Scanner leer= new Scanner(System.in);
    public static int oper(int x, int y, int z){
        int opera=0;
        int p=0;
        switch(z){
            case 1:opera=x+y;break;
            case 2:opera=x-y;break;
            case 3:opera=x*y;break;
            case 4:float oper;opera=((x+y)/2);break;
        }
        
        return opera;
    }
    public static void main(String[] args){
        int a=0;
        int b=0;
        int c=0;
        
        while (true){
            System.out.println("¿Qué quieres hacer?"+"\n"+"1.Sumar"+"\n"+"2.restar"+"\n"+"3.multiplicar"+"\n"+"4.promedio"+"\n"+"5.salir");
            c=leer.nextInt();
            if (c==5){
                break;}

            System.out.println("Ingrese el primer número:");
            a=leer.nextInt();
            
            System.out.println("Ingrese el segundo número:");
            b=leer.nextInt();
            
            int resul=oper(a,b,c);
            System.out.println("El resultado es: "+resul+"\n");
        }
        
    }
}