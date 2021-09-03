
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
        
public class Dialogo {
    
    public static void main(String[] args) {
        
        //Ejemplo página 91
        //JOptionPane.showMessageDialog(null, "Bienvenido a Java");
        
        
        
        
        
        //*******************************************
        //Ejemplo página 92
        //Pide al usuario que escriba su nombre
        //String nombre = JOptionPane.showInputDialog("¿Cuál es su nombre?");
        
        //Crea el mensaje
        //String mensaje = String.format("Bienvenido %s%n a la programación en Java!", nombre);
        
        //Muestra el mensaje para dar la bienvenida al usuario por su nombre
        //JOptionPane.showMessageDialog(null, mensaje);
        
        
        
        
        //*******************************************
        //Ejercicio para modificar el programa suma
        String numero1 = JOptionPane.showInputDialog("Ingresa el primer número:");
        String numero2 = JOptionPane.showInputDialog("Ingresa el segundo número:");
        int a = parseInt(numero1), b = parseInt(numero2);
                
        String resultado = String.format("La suma de %d + %d es %d",  a, b, a + b);
        JOptionPane.showMessageDialog(null,resultado);
        
    }
    
}
