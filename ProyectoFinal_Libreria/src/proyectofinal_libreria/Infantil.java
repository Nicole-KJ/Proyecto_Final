package proyectofinal_libreria;
import javax.swing.JOptionPane;
public class Infantil {
    private String titulo;
    private String autor;
    private int año;
    private int idLibro;
    
    public Infantil(){
        this.titulo="";
        this.autor="";
        this.año=0;
        this.idLibro=0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }
    Infantil datos[]=new Infantil[10];
    public void llenarInfoInfantil (){
        int i;
        for(i=0;i<datos.length;i++){
            Infantil n=new Infantil();
            
            n.setTitulo(JOptionPane.showInputDialog(null,
                    "Ingrese el titulo del libro Infantil: " ));
            n.setAutor(JOptionPane.showInputDialog(null,
                    "Ingrese el autor del libro: "));
            n.setAño(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese el año de publicación del libro: ")));
            n.setIdLibro(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese el ID del libro: ")));
            datos[i]=n;
        }
    }
    public void mostarInfantil(){
    int i;
    for(i=0;i<datos.length;i++){
        JOptionPane.showMessageDialog(null,
            "***Información Libros Infantil***"
            + "\nTitulo: " +datos[i].getTitulo()
            + "\nAutor: " +datos[i].getAutor()
            + "\nAño de publicación: " +datos[i].getAño()
            + "\nID del libro: " +datos[i].getIdLibro());
        }
    }   
    
}
