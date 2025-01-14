package Animales;

public class Perro {
    String raza, color, ladrido;
    int años;
    int obtenerEdad(){
        return años;
    }
    String obtenerColor(){
        return color;
    }
    String obtenerRaza(){
        return raza;
    }
    String obtenerLadrido(){
        return ladrido;
    }
    void establecerColor(String clr) {
        color = clr;
    }
    void establecerRaza(String rz) {
        raza = rz;
    }
    void establecerEdad(int edad) {
        años = edad;
    }
    void establecerLadrido(String mau) {
        ladrido = mau;
    }
}
