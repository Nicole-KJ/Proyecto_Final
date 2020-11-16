package proyectofinal_libreria;
import javax.swing.JOptionPane;
public class ProcesoPrestamo {
    private int proceso = 0;
    private String idCliente = "";
    private String fecha = "";

    public int getProceso() {
        return proceso;
    }

    public void setProceso(int proceso) {
        this.proceso = proceso;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
