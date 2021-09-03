/*
3.14 (La clase Fecha) Cree una clase llamada Fecha, que incluya tres variables de instancia:
    -un mes (tipo int)
    -un día (tipo int)
    -un año (tipo int)
*Su clase debe tener un constructor que inicialice las tres variables de instancia
*Debe asumir que los valores que se proporcionan son correctos.
*Proporcione un método establecer y un método obtener para cada variable de instancia. 
*Proporcione un método mostrarFecha, que muestre el mes, día y año, separados por barras diagonales (/).
*Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de la clase Fecha.
*/

public class Fecha {
    private int numeroMes;
    private int numeroDia;
    private int numeroAnio;
    
    public Fecha(int numeroMes, int numeroDia, int numeroAnio){
        this.numeroMes = numeroMes;
        this.numeroDia = numeroDia;
        this.numeroAnio = numeroAnio;
    }
    
    public void establecerNumeroMes(int numeroMes){
        this.numeroMes = numeroMes;
    }
    
    public int obtenerNumeroMes(){
        return numeroMes;
    }
    
    public void establecerNumeroDia(int numeroDia){
        this.numeroDia = numeroDia;
    }
    
    public int obtenerNumeroDia(){
        return numeroDia;
    }
    
    public void establecerNumeroAnio(int numeroAnio){
        this.numeroAnio = numeroAnio;
    }
    
    public int obtenerNumeroAnio(){
        return numeroAnio;
    }
    
    public void mostraFecha(){
        System.out.printf("La fecha ingresada es: %d/%d/%d%n", numeroMes, numeroDia, numeroAnio);
    }
    
}
