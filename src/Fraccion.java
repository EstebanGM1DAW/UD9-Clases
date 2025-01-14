public class Fraccion {
    //atributos
    int denominador;
    int numerador;
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
    public void simplificar(){
        do {
        if (numerador%2==0 && denominador%2==0) {
            numerador = numerador/2;
            denominador = denominador/2;
        } 
        if (numerador%3==0 && denominador%3==0) {
            numerador = numerador/3;
        }
        if (numerador%5==0 && denominador%5==0) {
            numerador = numerador/5;
            denominador = denominador/5;
        }
    } while (numerador > 1 && denominador > 1);
    }
}
