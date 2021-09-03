
//Entrada y salida de números de punto flotante con objetos Cuenta.
import java.util.Scanner;

public class PruebaCuenta 
{
    public static void main(String[] args) 
    {
        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("Jhon Blue", -7.53);
        
        //cuenta1.mostrarCuenta(Cuenta cuenta1);
        PruebaCuenta.mostrarCuenta(cuenta1);
        PruebaCuenta.mostrarCuenta(cuenta2);
        
        //Crea un objeto Scanner para obtener la entrada de la ventan de comandos
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escriba el monto a depositar para la cuenta1: ");
        double montoDeposito = entrada.nextDouble();    //Obtiene entrada del usuario
        System.out.printf("%nsumando %.2f al saldo de cuenta1%n%n",
                montoDeposito);
        cuenta1.depositar(montoDeposito);   //suma al saldo de cuenta1
        
        PruebaCuenta.mostrarCuenta(cuenta1);
        PruebaCuenta.mostrarCuenta(cuenta2);
        
        System.out.print("Escriba el monto a depositar para la cuenta2: ");
        montoDeposito = entrada.nextDouble();    //Obtiene entrada del usuario
        System.out.printf("%nsumando %.2f al saldo de cuenta2%n%n",
                montoDeposito);
        cuenta2.depositar(montoDeposito);   //suma al saldo de cuenta2
        
        PruebaCuenta.mostrarCuenta(cuenta1);
        PruebaCuenta.mostrarCuenta(cuenta2);
        
        //Pide la cantidad a retirar de la cuenta1
        System.out.print("\nEscriba el monto a retirar de la cuenta1: ");
        double montoRetiro = entrada.nextDouble();

        if (montoRetiro > cuenta1.obtenerSaldo()) {
            System.out.println("El monto a retirar excede el saldo de la cuenta");
        }
        else{
            cuenta1.retirar(montoRetiro);
            System.out.printf("Saldo de %s después de retirar es: $%.2f%n",
            cuenta1.obtenerNombre(),cuenta1.obtenerSaldo());
        }
        
        //cuenta1.mostrarCuenta(Cuenta cuenta1);
    }
    
    public static void mostrarCuenta(Cuenta cuentaAMostrar)
    {
        System.out.printf("Saldo de %s: $%.2f%n",
            cuentaAMostrar.obtenerNombre(),cuentaAMostrar.obtenerSaldo());
    }
    
}
//Depositar en cuenta1 25.53
//Depositar en cuenta2 123.45
//EJERCICIO DE LA PÁGINA 98