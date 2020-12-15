package proyectofinal_libreria;
import javax.swing.JOptionPane;
public class InformacionCliente {
    private String nombre;
    private String apellido1;
    private int idCliente;
    private int cedula;
    private String fechaNacimiento;
    
    public InformacionCliente(){
        this.nombre="";
        this.apellido1="";
        this.idCliente=0;
        this.cedula=0;
        this.fechaNacimiento="";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    InformacionCliente datos[]=new InformacionCliente[10];
    
    public void LlenarInfoCliente (){
        int i;
        for(i=0;i<datos.length;i++){
            InformacionCliente c=new InformacionCliente();
            c.setNombre(JOptionPane.showInputDialog(null,
                    "Ingrese el nombre del cliente" ));
            c.setApellido1(JOptionPane.showInputDialog(null,
                    "Ingrese el apellido del cliente"));
            c.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese la cédula del cliente")));
            c.setFechaNacimiento(JOptionPane.showInputDialog(null,
                    "Ingrese la fecha de nacimiento del cliente"));
            c.setIdCliente(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese un ID para el cliente")));
            datos[i]=c;
        }
    }
    public void mostar(){
        int i;
        for(i=0;i<datos.length;i++){
            JOptionPane.showMessageDialog(null,
                    "***Información Cliente***"
                            + "\nNombre Completo: " +datos[i].getNombre()+" "+datos[i].getApellido1()
                            + "\nCédula: " +datos[i].getCedula()
                            + "\nFecha de Nacimiento: " +datos[i].getFechaNacimiento()
                            + "\nID: " +datos[i].getIdCliente());
        }
    }
    
}
