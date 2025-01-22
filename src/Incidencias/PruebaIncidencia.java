package Incidencias;

public class PruebaIncidencia {
    public static void main(String[] args) {
        
    
    Incidencia inc1 = new Incidencia("No tiene acceso a internet");
    Incidencia inc2 = new Incidencia("No arranca");
    Incidencia inc3 = new Incidencia("La pantalla se ve rosa");
    Incidencia inc4 = new Incidencia("Hace un ruido extraño");
    Incidencia inc5 = new Incidencia("Se cuelga al abrir 3 ventanas");
    inc2.resuelve("El equipo no estaba enchufado");
    inc3.resuelve("Cambio del cable VGA");
    System.out.println(inc1);
    System.out.println(inc2);
    System.out.println(inc3);
    System.out.println(inc4);
    System.out.println(inc5);
    System.out.println("Incidencias pendientes: " + Incidencia.getPendientes());
}
}
