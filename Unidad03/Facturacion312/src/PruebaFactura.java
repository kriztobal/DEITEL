
import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        
        Factura articulo = new Factura();
        
        Scanner entrada =  new Scanner(System.in);
        
        System.out.print("Nombre de la pieza: ");
        String nombre = entrada.nextLine();
        articulo.establecerNombrePieza(nombre);
        
        
        System.out.print("Descripción de la pieza: ");
        String descripcion = entrada.nextLine();
        articulo.establecerDescripcionPieza(descripcion);
        
        
        System.out.print("Cantidad de piezas del artículos: ");
        int cantidad = entrada.nextInt();
        articulo.establecerCantidadArticulosPorPieza(cantidad);
        
        
        System.out.print("Precio por pieza: ");
        double precio = entrada.nextDouble();
        articulo.establecerPrecioPieza(precio);
        
        
        System.out.println("\n\n***************FACTURA***************");
        System.out.printf("Nombre: %s%n", articulo.obtenerNombrePieza());
        System.out.printf("Descripción: %s%n", articulo.obtenerDescripcionPieza());
        System.out.printf("Cantidad: %d%n", articulo.obtenerCantidadArticulosPorPieza());
        System.out.printf("Precio: %.2f%n", articulo.obtenerPrecioPieza());
        System.out.printf("%nTOTAL: %.2f%n", articulo.obtenerMontoFactura());
    }
}
