package proyectofinal_libreria;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        
        int opcion;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el proceso que desea realizar pro medio de digitar"
                + "el numero que le corresponde:"
                + "/n1. Inscribir cliente."
                + "/n2. Actualizar datos de cliente."
                + "/n3. Prestamo de libro."
                + "/n4. Devolver libro."
                + "/n5. Libros disponibles."
                + "/n0. Salir del programa."));
        
        if (opcion == 1) {
            // Añadir clase y metodos correspondientes para completar proceso//
        } else if (opcion == 2) {
            // Añadir clase y metodos correspondientes para completar proceso//
        } else if (opcion == 3) {
            // Añadir clase y metodos correspondientes para completar proceso//
        } else if (opcion == 4) {
            // Añadir clase y metodos correspondientes para completar proceso//
        }else if (opcion == 5) {
            // Añadir clase y metodos correspondientes para completar proceso//
        } else {
            JOptionPane.showMessageDialog(null, "Ha deseado salir del programa.");
        }         
    }
    
}
