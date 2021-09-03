
import java.util.Scanner;

public class A03SepararNumero {
    public static void main(String[] args){
        
        Scanner consola = new Scanner(System.in);
        
        int numero;
            System.out.print("Ingresa un número de 5 dígitos: ");
        numero = consola.nextInt();
        
        if (numero > 99999) {
            System.out.print("El número debe ser de 5 dígitos: ");
            numero = consola.nextInt();
        }
        
        if (numero < 10000) {
            System.out.print("El número debe ser de 5 dígitos: ");
            numero = consola.nextInt();
        }
        //8 7 6 5 4 
        System.out.printf("%d   %d   %d   %d   %d%n", (numero/10000), (numero%10000/1000),(numero%1000/100), (numero%100/10), (numero%10));
        
    }
    
}
