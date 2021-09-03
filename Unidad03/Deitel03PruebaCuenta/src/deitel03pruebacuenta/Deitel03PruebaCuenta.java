package deitel03pruebacuenta;
//Entrada y salida de números de punto flotante con objetos Cuenta.
import java.util.Scanner;

public class Deitel03PruebaCuenta 
{
    public static void main(String[] args) 
    {
        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("Jhon Blue", -7.53);
        
        //muestra el saldo inicial de cada objeto
        System.out.printf("Saldo de %s: $%.2f%n",
            cuenta1.obtenerNombre(),cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n",
            cuenta2.obtenerNombre(),cuenta2.obtenerSaldo());
        
        //Crea un objeto Scanner para obtener la entrada de la ventan de comandos
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escriba el monto a depositar para la cuenta1: ");
        double montoDeposito = entrada.nextDouble();    //Obtiene entrada del usuario
        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n",
                montoDeposito);
        cuenta1.depositar(montoDeposito);   //suma al saldo de cuenta1
        
        //muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n",
            cuenta1.obtenerNombre(),cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n",
            cuenta2.obtenerNombre(),cuenta2.obtenerSaldo());
        
        System.out.print("Escriba el monto a depositar para la cuenta2: ");
        montoDeposito = entrada.nextDouble();    //Obtiene entrada del usuario
        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n",
                montoDeposito);
        cuenta2.depositar(montoDeposito);   //suma al saldo de cuenta2
        
        //muestra los saldos
        System.out.printf("Saldo de %s: $%.2f%n",
            cuenta1.obtenerNombre(),cuenta1.obtenerSaldo());
        System.out.printf("Saldo de %s: $%.2f%n%n",
            cuenta2.obtenerNombre(),cuenta2.obtenerSaldo());
    }
}

//EJEMPLO PÁGINA 86     Figura 3.9