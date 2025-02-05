package PuntoYLinea;

public class Linea {
    double uno,dos,tres,cuatro;
    public Linea(Punto a, Punto b){
        this.uno = a.getPrimer();
        this.dos = a.getSegundo();
        this.tres = b.getPrimer();
        this.cuatro = b.getSegundo();
    }

    @Override
    public String toString(){
        String mensaje = "";
        mensaje+="Linea formada por los puntos: ("+uno+","+dos+") Y ("+tres+","+cuatro+")";
        return mensaje;
    }
}
