public class FraccionPrueba {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion();
        f1.setFraccion(1344, 360);
        System.out.println("Antes de simplificar: "+f1.getDenominador() + " " + f1.getNumerador());
        Fraccion.simplificar(f1);
        System.out.println("Despues de simplificar: "+f1.getDenominador() + " " + f1.getNumerador());
    }
}
