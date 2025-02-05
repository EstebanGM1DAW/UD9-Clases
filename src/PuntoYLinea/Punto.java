package PuntoYLinea;

public class Punto {
    double primer;
    double segundo;

    public Punto(double a, double b){
        this.primer = a;
        this.segundo = b;
    }

    public double getPrimer(){
        return primer;
    }
    public double getSegundo(){
        return segundo;
    }
}
