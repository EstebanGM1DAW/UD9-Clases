package Incidencias;

public class Incidencia {
    String incidencia;
    int numIncidencia;
    static int pendientes;
    String estado;
    int puesto;
    String solucion;
    public Incidencia(String incidencia) {
        this.incidencia = incidencia;
        this.estado = "pendiente";
        numIncidencia++;
        pendientes++;
        this.puesto = (int) (Math.random()*100+1);
    }
    @Override
    public String toString() {
        String mensaje="";
        if (estado.equals("pendiente")) {
            mensaje = "Incidencia"+numIncidencia+": " + "- Puesto: "+ puesto+ " - "+incidencia +" - "+estado;  
        } else if (estado.equals("resuelta")) {
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
        if (estado.equals("pendiente")) {
            pendientes--;
            this.solucion = solucion;
            estado = "resuelta";

        }
    }
}
