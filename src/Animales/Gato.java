package Animales;

public class Gato {
    private String color, raza, maullido;
    private int edad;
    int obtenerEdad(){
        return edad;
    }
    String obtenerColor(){
        return color;
    }
    String obtenerRaza(){
        return raza;
    }
    String obtenerMaullido(){
        return maullido;
    }
    void establecerColor(String clr) {
        color = clr;
    }
    void establecerRaza(String rz) {
        raza = rz;
    }
    void establecerEdad(int años) {
        edad = años;
    }
    void establecerMaullido(String mau) {
        maullido = mau;
    }
}
