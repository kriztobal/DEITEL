
//Clase Cuenta que contiene una variable de instancia llamada nombre
// y métodos para establecer y obtener su valor

//public class A02Cuenta {
//    
//    private String nombre;  //Variable de instancia
//    
//    //Método para establecer el nombre del objeto
//    public void establecerNombre(String nombre){
//        this.nombre = nombre;
//    }
//    
//    public String obtenerNombre(){
//        return nombre;  //Devuelve el valor de nombre a quien lo invocó
//    }
//    
//}





//VERSIÓN DE LA PÁGINA 82 -DEITEL *************************

public class A02Cuenta{
    
    private String nombre; //variable de instancia
    
    //el constructor inicializa nombre con el parámetro nombre
    public A02Cuenta(String nombre){    //el nombre del constructor es el nombre de la clase
        this.nombre = nombre;
    }
    
    //método para establecer el nombre
    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }
    
    //método para recuperar el nombre
    public String obtenerNombre(){
        return nombre;
    }
    
}