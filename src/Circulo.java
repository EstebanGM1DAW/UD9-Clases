public class Circulo {
    //atributos
    private int x;
    private int y;
    private int radio;
    //metodos
    int obtenerX() {
        return x;
    }
    int obtenerY() {
        return y;
    }
    void establecerX(int valorX) {
        x = valorX;
    }
    void establecerY(int valorY) {
        y = valorY;
    }
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.establecerX(10);
        circulo1.establecerY(20);
        System.out.println("X = " + circulo1.obtenerX());
        System.out.println("Y = " + circulo1.obtenerY());
    }
}


