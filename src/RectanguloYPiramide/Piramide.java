package RectanguloYPiramide;

public class Piramide {
    int altura;
    static int numPiramides;

    public Piramide(int a) {
        this.altura = a;
        numPiramides++;
    }

    public int getAltura() {
        return altura;
    }

    static public int getPiramides() {
        return numPiramides;
    }

    @Override
    public String toString() {
        String mensaje = "";
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return mensaje;
    }
}
