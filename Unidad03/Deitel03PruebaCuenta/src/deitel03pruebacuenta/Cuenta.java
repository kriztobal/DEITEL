package deitel03pruebacuenta;
//La clase Cuenta con una variable de instancia double llamada saldo
//y un constructor además de un método llamado depósito que realiza validación

public class Cuenta
{
    private String nombre;  //variable de instancia
    private double saldo;   //variable de instancia    
    
    //constructor de Cuenta que recibe dos parámetros
    public Cuenta(String nombre, double saldo)
    {
        this.nombre = nombre;    //asigna nombre a la variable de instancia nombre
        
        //valida que el saldo sea mayor que 0.0; de lo contrario,
        //la variable de instancia saldo mantiene su valor inicial predeterminado de 0.0
        if(saldo > 0.0)
            this.saldo = saldo;
    }
    
    //método que deposita (suma) sólo una cantidad válida al saldo
    public void depositar(double montoDeposito)
    {
        if (montoDeposito > 0.0)
            saldo = saldo + montoDeposito;
    }
    
    //método que devuelve el saldo de la cuenta
    public double obtenerSaldo()
    {
        return saldo;
    }
    
    //método que establece el nombre
    public void establecerNombre(String nombre)
    {
        this.nombre =  nombre;
    }
    
    //método que devuelve el nombre
    public String obtenerNombre()
    {
        return nombre;  //devuelve el valor de nombre a quien lo invocó
    }
}   //Fin de la clase Cuenta

//EJEMPLO PÁGINA 85     Figura 3.8