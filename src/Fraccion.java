public class Fraccion {
    //atributos
    private int denominador;
    private int numerador;
    //getters
    public int getDenominador() {
        return denominador;
    }
    public int getNumerador(){
        return numerador;
    }
    //setters
    public void setFraccion(int den, int num){
        denominador = den;
        numerador = num;
    }
    //metodos
    public void invertir(){
        int a = numerador;
        numerador = denominador;
        denominador = a;
    }
    public Fraccion multiplicar(Fraccion f1, Fraccion f2){
        Fraccion f3 = new Fraccion();
        int den = f1.getDenominador()*f2.getDenominador();
        int num = f1.getNumerador()*f2.getNumerador();
        f3.setFraccion(den, num);
        return f3;
    }
    public static Fraccion dividir(Fraccion f1, Fraccion f2){
        Fraccion resultado = new Fraccion();
        int den = f1.getNumerador()*f2.getDenominador();
        int num = f1.getDenominador()*f2.getNumerador();
        resultado.setFraccion(num,den);
        return resultado;
    }
    public static void simplificar(Fraccion f1){
       int dividendo, divisor, mcd, resto;
       if (f1.numerador<f1.denominador) {
            dividendo = f1.numerador;
            divisor = f1.denominador;
       } else {
            divisor = f1.denominador;
            dividendo = f1.numerador;
       }
        while (divisor != 0) {
            resto = dividendo % divisor;
            dividendo = divisor;
            divisor = resto;
        }
        mcd = dividendo; // El último "dividendo" es el MCD
    
        // Simplificar la fracción dividiendo por el MCD
        f1.numerador =f1.numerador/mcd;
        f1.denominador = f1.denominador/mcd;
       }
    }
