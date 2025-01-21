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
    public void simplificar(){
       
    }
}
