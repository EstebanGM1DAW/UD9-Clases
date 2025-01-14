package Animales;

public class PruebasAnimales {
    public static void main(String[] args) {
        Gato doraemon = new Gato();
        doraemon.establecerColor("amarillo");
        doraemon.establecerEdad(10);
        doraemon.establecerMaullido("meow");
        doraemon.establecerRaza("siames");
        System.out.println("Doraemon: " + "Color: " + doraemon.obtenerColor() + " Edad: " + doraemon.obtenerEdad()
                + " Maullido: " + doraemon.obtenerMaullido());
        Perro agallas = new Perro();
        agallas.establecerColor("rosa");
        agallas.establecerRaza("susto");
        agallas.establecerEdad(12);
        agallas.establecerLadrido("guau");
    }

}
