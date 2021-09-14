
//Cómo solucionar el probelma del promedio de la clase mediante la repetición controlada por contador
import java.util.Scanner;

public class PromedioClase 
{
    public static void main(String[] args) 
    {
        //crea un objeto Scanner para obtener la aentrada de la ventana de comandos
        Scanner entrada =  new Scanner(System.in);
        
        //fase de inicialización
        int total = 0;  //inicializa la suma de calificaciones introducidas por el usuario
        int contadorCalificaciones = 1; //inicializa # de calificación a introducir a continuación
        
        //la fase de procesamiento usa la repetición controlada por contador
        while (contadorCalificaciones <= 10)    //itera 10 veces
        {
            System.out.print("Escriba la calificación: ");  //indicador
            int calificacion = entrada.nextInt();   //recibe siguiente calificación de entrada
            total = total + calificacion;   //suma calificación total
            contadorCalificaciones = contadorCalificaciones + 1;    //incrementa el contador en 1
        }
        
        //fase de terminación
        int promedio = total / 10;  //la división de enteros produce resultado entero
        
        //muestra el total y el promedio de las calificaciones
        System.out.printf("%nEl total de las 10 calificaciones es %d%n", total);
        System.out.printf("El promedio de la clase es %d%n", promedio);
    }
}
