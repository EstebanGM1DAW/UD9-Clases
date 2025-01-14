public class Rectangulo {
    private double y1,x1;
    private double x2,y2;
    //metodos
    double obtenerX1() {
        return x1;
    }
    double obtenerX2() {
        return x2;
    }
    double obtenerY1() {
        return y1;
    }
    double obtenerY2() {
        return y2;
    }
    void VertInfIzq(double unoX, double unoY) {
        x1 = unoX;
        y1 = unoY;
    }
    void VertSupDer(double dosX, double dosY) {
        x2 = dosX;
        y2 = dosY;
    }
    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo();
        rect1.VertInfIzq(23.4, 98.3);
        rect1.VertSupDer(12.4, 64.8);
        System.out.println("X1 = " + rect1.obtenerX1());
        System.out.println("X2 = " + rect1.obtenerX2());
        System.out.println("Y1 = " + rect1.obtenerY1());
        System.out.println("Y2 = " + rect1.obtenerY2());
    }
}

