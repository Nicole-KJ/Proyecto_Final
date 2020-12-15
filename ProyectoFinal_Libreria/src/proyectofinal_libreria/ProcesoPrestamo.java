package proyectofinal_libreria;
import javax.swing.JOptionPane;
public class ProcesoPrestamo {
    private int idLibro;
    private String titulo;
    private int idCliente;
    private String fechaPrestamo;
    private String fechaDevolucion;
        
    public ProcesoPrestamo(){
        this.idLibro=0;
        this.titulo="";
        this.fechaPrestamo="";
        this.idCliente=0;
        this.fechaDevolucion="";
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void Prestamo(){
            ProcesoPrestamo p=new ProcesoPrestamo();
            p.setIdCliente(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese el ID del cliente: " )));
            p.setTitulo(JOptionPane.showInputDialog(null,
                    "Ingrese el titulo del libro: "));
            p.setIdLibro(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese el ID del libro: ")));
            p.setFechaPrestamo(JOptionPane.showInputDialog(null,
                    "Ingrese fecha de prestamo del libro: "));    
 
            JOptionPane.showMessageDialog(null,
                    "***Información del Prestamo***"
                            + "\nID Cliente: " +p.getIdCliente()
                            + "\nTitulo del libro: " +p.getTitulo()
                            + "\nID del Libro: " +p.getIdLibro()
                            + "\nFecha de prestamo: " +p.getFechaPrestamo()
                            + "\nEl prestamo de libro tiene un maximo de 30 dias.");
        
    }
    public void Devolucion(){
            ProcesoPrestamo p=new ProcesoPrestamo();
            
            p.setIdCliente(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese el ID del cliente: " )));
            p.setTitulo(JOptionPane.showInputDialog(null,
                    "Ingrese el titulo del libro: "));
            p.setIdLibro(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese el ID del libro: ")));
            p.setFechaDevolucion(JOptionPane.showInputDialog(null,
                    "Ingrese fecha de devolucion del libro: "));     
    
            JOptionPane.showMessageDialog(null,
                    "***Información de Devolucion***"
                            + "\nID Cliente: " +p.getIdCliente()
                            + "\nTitulo del libro: " +p.getTitulo()
                            + "\nID del Libro: " +p.getIdLibro()
                            + "\nFecha de prestamo: " +p.getFechaDevolucion());
        
    }
    String infoLibro[][]=new String[3][2];
    public void InformacionLibro(){
        int x,y;
        for(x=0;x<3;x++){
            for(y=0;y<2;y++){
           String disponibilidadLibro;
            disponibilidadLibro=(JOptionPane.showInputDialog(null,
                    "Ingrese el título y la disponibilidad del libro"));
            infoLibro[x][y]=disponibilidadLibro;
            }
        }
    }
    public void mostrarInfo(){
        int x,y;
        for(x=0;x<3;x++){
            for(y=0;y<2;y++){
            JOptionPane.showMessageDialog(null,
                    "***Disponibilidad Libros***"
                            + "\n" +infoLibro[x][y]);
            }
        }
    }
}
