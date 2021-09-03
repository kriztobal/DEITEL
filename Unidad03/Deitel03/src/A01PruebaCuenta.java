
//Crear y manipular un objeto cuenta
//import java.util.Scanner;
//
//public class A01PruebaCuenta {
//    
//    public static void main(String[] args){
//        
//        //Crea un objeto Scanner para obtener la entrada desde el simbolo del sistema
//        Scanner entrada = new Scanner(System.in);
//        
//        //Crea un objeto cuenta y lo asigna a miCuenta
//        A02Cuenta miCuenta = new A02Cuenta();
//        
//        //muestra el valor inicial del nombre (null)
//        System.out.printf("El nombre inicial es: %s%n%n", miCuenta.obtenerNombre());
//        
//        //pide y lee el nombre
//        System.out.println("Introduzca el nombre:");
//        String elNombre = entrada.nextLine();
//        miCuenta.establecerNombre(elNombre);    //coloca el nombre en miCuenta
//        System.out.println();   //imprime una línea en blanco     
//        
//        //muestra el nombre almacenado en el objeto miCuenta
//        System.out.printf("El nombre en el objeto miCuenta es: %n%s%n",
//                miCuenta.obtenerNombre());
//    }
//}





//VERSIÓN DE LA PÁGINA 83 -DEITEL *************************

public class A01PruebaCuenta{

    public static void main(String[] args)
    {
    
    //crear dos objetos cuenta
    A02Cuenta cuenta1 = new A02Cuenta("Jane Green");
    A02Cuenta cuenta2 = new A02Cuenta("Jhon Blue");

    //muestra el valor inicial de nombre para cada cuenta
    System.out.printf("El nombre de cuenta1 es: %s%n", cuenta1.obtenerNombre());
    System.out.printf("El nombre de cuenta2 es: %s%n", cuenta2.obtenerNombre());
    }

}





