package proyectofinal_libreria;
//Keren Nicole Jimenez Fernandez & Scarleth Quesada Solera//
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        InformacionCliente c=new InformacionCliente();
        ProcesoPrestamo a=new ProcesoPrestamo();
        CienciaFiccion f=new CienciaFiccion();
        Drama d=new Drama();
        Historia h=new Historia();
        Infantil n=new Infantil();
        Misterio m=new Misterio();
        Main q=new Main();
        int opcion=1;
        while(opcion!=0){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el proceso que desea realizar por medio de digitar"
                + "el numero que le corresponde:"
                + "\n1. Asistencia."
                + "\n2. Ingresar datos de libros."
                + "\n3. Inscribir cliente."
                + "\n4. Prestamo de libro."
                + "\n5. Devolucion de libro."
                + "\n6. Información de prestamo de libro"
                + "\n0. Salir del programa."));
        
        switch (opcion) {
            case 3:
                c.LlenarInfoCliente();
                c.mostar();
                break;   
            case 4:
                a.Prestamo();
                break;
            case 5:
                a.Devolucion();
                break;        
            case 2:
                f.llenarInfoCienciaFiccion();
                f.mostarCienciaFiccion();
                d.llenarInfoDrama();
                d.mostarDrama();
                h.llenarInfoHistoria();
                h.mostarHistoria();
                n.llenarInfoInfantil();
                n.mostarInfantil();
                m.llenarInfoMisterio();
                m.mostarMisterio();
                break;
            case 6:
                a.InformacionLibro();
                a.mostrarInfo();
            case 1:
                q.asistenciaEmpleado();
                q.mostrarAsistencia();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ha deseado salir del programa.");
                break;
        }
        }
    }
    String asistencia[]=new String[6];
    public void asistenciaEmpleado(){
        int x;
        for(x=0;x<asistencia.length;x++){
           String asistenciaEmpleado;
            asistenciaEmpleado=(JOptionPane.showInputDialog(null,
                    "Ingrese el nombre de empleado y estado de asistencia (presente/ausente): "));
            asistencia[x]=asistenciaEmpleado;
        }
    }
    public void mostrarAsistencia(){
            JOptionPane.showMessageDialog(null,
                    "***Asistencia***"
                            + "\n" +asistencia[0]
            + "\n" +asistencia[1]
            + "\n" +asistencia[2]
            + "\n" +asistencia[3]
            + "\n" +asistencia[4]
            + "\n" +asistencia[5]);
        
    }
}
