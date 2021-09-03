
/*
EJERCICIO 3.6

*Los atributos de la clase deben incluir:
 - El primer nombre de la persona
 - Apellido
 - Fecha de nacimiento (atributos independientes para el mes, día y año)

*La clase debe tener un constructor que reciba esos datos como parámetros.
*Cada atributo debe proveer métodos establecer y obtener.
*Debe incluir un método que calcule y devuelva la edad de la persona.
*Escriba una aplicación que pida la información de la persona.
*Cree una instancia de un objeto de la clase FrecuenciasCardiacas e imprima la
información a partir de ese objeto (incluyendo el primer nombre de la persona,
su apellido y fecha de nacimiento).
*Calcular e imprimir la edad de la persona en años, frecuencia cardiaca
máxima y rango de frecuencia cardiaca esperada.

*/

public class FrecuenciasCardiacas {
    private String primerNombre;
    private String primerApellido;
    private int numeroMes;
    private int numeroDia;
    private int numeroAnio;
    
    //Constructor que recibe los datos
    public FrecuenciasCardiacas(String primerNombre, String primerApellido, int numeroMes, int numeroDia, int numeroAnio){
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.numeroMes = numeroMes;
        this.numeroDia = numeroDia;
        this.numeroAnio = numeroAnio;
    }
    
    //Método que establece el nombre
    public void establecerNombre(String primerNombre){
        this.primerNombre = primerNombre;
    }
    
    //Método que devuelve el nombre
    public String obtenerNombre(){
        return primerNombre;
    }
    
    //Método que establece el apellido
    public void establecerApellido(String primerApellido){
        this.primerApellido = primerApellido;
    }
    
    //Método que devuelve el apellido
    public String obtenerApellido(){
        return primerApellido;
    }
    
    //Método que establece el mes
    public void establecerMes(int numeroMes){
        if (numeroMes <= 12 && numeroMes > 0) {
            this.numeroMes = numeroMes;
        }
    }
    
    //Método que devuelve el mes
    public int obtenerMes(){
        return numeroMes;
    }
    
    //Método que establece el dia
    public void establecerDia(int numeroDia){
        if (numeroDia >0) {
            this.numeroDia = numeroDia;
        }
    }
    
    //Método que devuelve el día
    public int obtenerDia(){
        return numeroDia;
    }
    
    //Método que establece el año
    public void establecerAnio(int numeroAnio){
        if (numeroAnio > 0) {
            this.numeroAnio = numeroAnio;
        }
    }
    
    //Método que devuelve el anio
    public int obtenerAnio(){
        return numeroAnio;
    }
    
    //Método que calcula y devuelve la edad de la persona
    public int establacerEdad(){
        return 2021-numeroAnio;
    }
    
}
