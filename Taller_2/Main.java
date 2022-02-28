import java.util.Scanner;

public class Main {
    
    private static Scanner leer=new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Ingresa un número entero por favor:");
        int x=leer.nextInt();
        
        System.out.println("ingresa otro número entero por favor:");
        int y=leer.nextInt();
        
        System.out.println("¿Qué quieres hacer?"+"\n"+"1.Sumar"+"\n"+"2.restar"+"\n"+"3.multiplicar"+"\n"+"4.promedio");
        int opcion=leer.nextInt();
        int result=0;
        float resul=0;
        int p=0;
        
        switch (opcion){
            case 1:result=x+y;break;
            case 2:result=x-y;break;
            case 3:result=x*y;break;
            case 4:p=1+1;break;
            default:System.out.println("Opcion incorrecta");
        }
        if (p==2){
            resul=x+y;
            float prome=resul/2;
            System.out.println("El resultado es: "+ prome);}
        else {
            System.out.println("El resultado es: "+ result);}
        
}
}