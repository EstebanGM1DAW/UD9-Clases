public class FraccionPrueba {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion();
        f1.setFraccion(1344, 360);
        Fraccion.simplificar(f1);
        System.out.println(f1.getDenominador() + " " + f1.getNumerador());
    }
}
