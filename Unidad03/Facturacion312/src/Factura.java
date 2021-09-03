/*
*Cree una clase Factura para representar una factura para un artículo vendido.
*Debe incluir 4 variables de instancia.
    -Número de pieza(String).
    -Descripción de la pieza(String).
    -Cantidad de artículos de esa pieza que se van a comprar(int).
    -Precio por artículo(double).
*La clase debe tener un constructor para inicializar las 4 variables de instancia.
*Proporcione un método establecer y un método obtener para cada variable de instancia.

*Proporcione un método llamado obtenerMontoFactura, que calcule el monto de la
factura (es decir, que multiplique la cantidad de artículos por el precio de
cada uno) y después devuelva ese monto como un valor double.
*Si la cantidad no es positiva, debe establecerse en 0.
*Si el precio por artículo no es positivo, debe establecerse en 0.0

*/

public class Factura {
    private String nombrePieza;
    private String descripcionPieza;
    private int cantidadArticulosPorPieza;
    private double precioPieza;
    
    //Inicializa las variables de instancia
//    public Factura(String nombrePieza, String descripcionPieza, int cantidadArticulosPorPieza, double precioPieza){
//        this.nombrePieza = nombrePieza;
//        this.descripcionPieza = descripcionPieza;
//        this.cantidadArticulosPorPieza = cantidadArticulosPorPieza;
//        this.precioPieza = precioPieza;
//    }
    
    //método que establece el número de piezas
    public void establecerNombrePieza(String nombrePieza){
        this.nombrePieza = nombrePieza;
    }
    
    //método que devuelve el número de piezas
    public String obtenerNombrePieza(){
        return nombrePieza; //Devuelve el valor de numeroPieza a quien lo invocó
    }

    //método que establece la descripción de la pieza
    public void establecerDescripcionPieza(String descripcionPieza){
        this.descripcionPieza = descripcionPieza;
    }
    
    //método que devuelve la descripción de la pieza
    public String obtenerDescripcionPieza(){
        return descripcionPieza; //Devuelve el valor de numeroPieza a quien lo invocó
    }

    //método que establece la cantidad de artículos por pieza
    public void establecerCantidadArticulosPorPieza(int cantidadArticulosPorPieza){
        if (cantidadArticulosPorPieza > 0) {
            this.cantidadArticulosPorPieza = cantidadArticulosPorPieza;
        }
    }
    
    //método que devuelve la cantidad de artículos por pieza
    public int obtenerCantidadArticulosPorPieza(){
        return cantidadArticulosPorPieza; //Devuelve el valor de numeroPieza a quien lo invocó
    }

    //método que establece el precio por pieza
    public void establecerPrecioPieza(double precioPieza){
        if (precioPieza > 0.0) {
            this.precioPieza = precioPieza;
        }
    }
    
    //método que devuelve el precio por pieza
    public  double obtenerPrecioPieza(){
        return precioPieza; //Devuelve el valor de numeroPieza a quien lo invocó
    }

    
    //método que calcula el monto de la factura
    public double obtenerMontoFactura(){
        return cantidadArticulosPorPieza * precioPieza;
    }


}