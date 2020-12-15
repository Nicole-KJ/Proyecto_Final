package proyectofinal_libreria;
import javax.swing.JOptionPane;
public class Historia {
    private String titulo;
    private String autor;
    private int año;
    private int idLibro;
    
    public Historia(){
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
    Historia datos[]=new Historia[10];
    public void llenarInfoHistoria (){
        int i;
        for(i=0;i<datos.length;i++){
            Historia h=new Historia();
            
            h.setTitulo(JOptionPane.showInputDialog(null,
                    "Ingrese el titulo del libro Historia: " ));
            h.setAutor(JOptionPane.showInputDialog(null,
                    "Ingrese el autor del libro: "));
            h.setAño(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese el año de publicación del libro: ")));
            h.setIdLibro(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese el ID del libro: ")));
            datos[i]=h;
        }
    }
    public void mostarHistoria(){
    int i;
    for(i=0;i<datos.length;i++){
        JOptionPane.showMessageDialog(null,
            "***Información Libros Historia***"
            + "\nTitulo: " +datos[i].getTitulo()
            + "\nAutor: " +datos[i].getAutor()
            + "\nAño de publicación: " +datos[i].getAño()
            + "\nID del libro: " +datos[i].getIdLibro());
        }
    }
}
