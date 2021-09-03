
import java.util.Scanner;

public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Se solicitan los datos de la persona
        System.out.print("Ingresa el nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Ingresa el apellido: ");
        String apellido = entrada.nextLine();
        
        System.out.print("Ingresa el mes de nacimiento: ");
        int mes = entrada.nextInt();
        
        System.out.print("Ingresa el dia de nacimiento: ");
        int dia = entrada.nextInt();
        
        System.out.print("Ingresa el año de nacimiento: ");
        int anio = entrada.nextInt();
        
        //Creación del objeto datosPersona con los datos recibidos previamente
        FrecuenciasCardiacas datosPersona = new FrecuenciasCardiacas(nombre, apellido, mes, dia, anio);
        
        //Se imprimen los datos de la persona
        System.out.printf("%nSe llama %s %s y nació el %d/%d/%d", datosPersona.obtenerNombre(), datosPersona.obtenerApellido(),
                datosPersona.obtenerMes(), datosPersona.obtenerDia(), datosPersona.obtenerAnio());
        
        //Fórmula para obtener la frecuencia cardiaca
        double formulaFrecuencia = 220 - datosPersona.establacerEdad();
        
        //Se imprime la edad en años y la frecuencia mínima y máxima recomendada
        System.out.printf("%nSu edad es: %d años %nSu frecuencia cardiaca mínima es: %.0f %nSu frecuencia cardiaca máxima es: %.0f%n",
                datosPersona.establacerEdad(), formulaFrecuencia/2, formulaFrecuencia*.85 );
    }
    
}
