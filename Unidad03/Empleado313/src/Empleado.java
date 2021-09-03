/*

*La clase debe incluir tres variables de instancia
    -primer nombre (tipo String)
    -un apellido paterno (tipo String)
    -un salario mensual (double)
*La clase debe tener un constructor que inicialice las tres variables de instancia
*Proporcione un método establecer y un método obtener para cada variable de instancia
*Si el salario mensual no es positivo, no establezca su valor.
*Escriba una aplicación de prueba llamada PruebaEmpleado, que demuestre las capacidades de la clase Empleado.
*Cree dos objetos Empleado y muestre el salario anual de cada objeto. 
*Proporcione a cada Empleado un aumento del 10% y muestre el salario anual de cada Empleado otra vez.

*/

public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;
    
    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual){
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }
    
    public void establecerPrimerNombre(String primerNombre){
        this.primerNombre = primerNombre;
    }
    
    public String obtenerPrimerNombre(){
        return primerNombre;
    }
    
    public void establecerApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }
    
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }
    
    public void establecerSalarioMensual(double salarioMensual){
        this.salarioMensual =  salarioMensual;
    }
    
    public double obtenerSalarioMensual(){
        return salarioMensual;
    }
    
    
}