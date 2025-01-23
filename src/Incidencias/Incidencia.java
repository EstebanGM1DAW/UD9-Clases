package Incidencias;

public class Incidencia {
    String incidencia;
    int numIncidencia;
    static int pendientes;
    String estado;
    int puesto;
    String solucion;
    public Incidencia(int codigo,String incidencia) {
        this.incidencia = incidencia;
        this.estado = "Pendiente";
        this.numIncidencia = numIncidencia+1;
        pendientes++;
        this.puesto = codigo;
    }
    @Override
    public String toString() {
        String mensaje="";
        if (estado.equals("Pendiente")) {
            mensaje = "Incidencia"+numIncidencia+": " + "- Puesto: "+ puesto+ " - "+incidencia +" - "+estado;  
        } else if (estado.equals("Resuelta")) {
            mensaje = "Incidencia"+numIncidencia+": " + "- Puesto: "+ puesto+ " - "+ estado+ " - "+solucion;  
        }
        return mensaje;
    }
    //getters
    public String getEstado(){
        return estado;
    }
    public String getIncidencia(){
        return incidencia;
    }
    public static int getPendientes(){
        return pendientes;
    }
    public int getNumIncidencia(){
        return numIncidencia;
    }
    public void resuelve(String solucion){
        pendientes--;
        this.solucion = solucion;
        estado = "Resuelta";
    }
}
