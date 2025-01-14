public class FraccionPrueba {
    public static void main(String[] args) {
        Fraccion f0 = new Fraccion();
        Fraccion f1 = new Fraccion();
        Fraccion f2 = new Fraccion();
        f1.setFraccion(3, 9);
        f2.setFraccion(10, 5);
        Fraccion f3 = f0.dividir(f1, f2);
        System.out.println(f3.getDenominador() + "\n---\n" + f3.getNumerador());

    }
}
