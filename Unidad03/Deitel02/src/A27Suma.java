
import java.util.Scanner;

public class A27Suma {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int suma;
        
        System.out.print("Escriba el primer entero: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Escriba el segundo entero: ");
        numero2 = entrada.nextInt();
        
        suma = numero1 + numero2;
        
        System.out.printf("La suma es %d%n", suma);
        
    }
    
}
