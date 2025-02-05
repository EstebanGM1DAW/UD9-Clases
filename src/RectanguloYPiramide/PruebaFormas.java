package RectanguloYPiramide;

public class PruebaFormas {
    public static void main(String[] args) {
        Piramide p1 = new Piramide(4);
        Rectangulo r1 = new Rectangulo(4, 3);
        Rectangulo r2 = new Rectangulo(6, 2);
        System.out.println(p1);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Piramides Creadas: "+Piramide.getPiramides());
        System.out.println("Rectangulos Creados: "+Rectangulo.getRectangulos());
    }
}
