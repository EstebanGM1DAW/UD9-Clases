public class FraccionPrueba {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion();
        Fraccion f2 = new Fraccion();
        f1.setFraccion(678, 120);
        f2.setFraccion(10, 5);
        Fraccion.simplificar(f1);
        System.out.println(f1.getDenominador() + " " + f1.getNumerador());
    }
}
