
//import java.util.Scanner;


public class PruebaEmpleado {
    public static void main(String[] args) {
        //Scanner entrada =  new Scanner(System.in);
        
        Empleado empleado1 = new Empleado("Juana", "Martínez", 15000.00);
        Empleado empleado2 = new Empleado("Pedro", "Reyes", 12000.00);
        
        System.out.printf("El salario anual de %s %s es de %.2f%n", empleado1.obtenerPrimerNombre(),
                empleado1.obtenerApellidoPaterno(),(12*empleado1.obtenerSalarioMensual()) );
        System.out.printf("El salario anual de %s %s es de %.2f%n", empleado2.obtenerPrimerNombre(),
                empleado2.obtenerApellidoPaterno(),(12*empleado2.obtenerSalarioMensual()) );
        
        double aumentoEmpleado1 = (empleado1.obtenerSalarioMensual()/100)*10;
        double aumentoEmpleado2 = (empleado2.obtenerSalarioMensual()/100)*10;
        
        System.out.printf("%nEl salario anual de %s %s con el aumento de 10 porciento es de %.2f%n", empleado1.obtenerPrimerNombre(),
                empleado1.obtenerApellidoPaterno(),(12* (empleado1.obtenerSalarioMensual() + aumentoEmpleado1)) );
        System.out.printf("El salario anual de %s %s con el aumento de 10 porciento es de %.2f%n", empleado2.obtenerPrimerNombre(),
                empleado2.obtenerApellidoPaterno(),(12* (empleado2.obtenerSalarioMensual() + aumentoEmpleado2)) );
        
    }
    
}
