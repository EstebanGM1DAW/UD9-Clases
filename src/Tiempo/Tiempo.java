package Tiempo;

public class Tiempo {
    int minutos, horas, segundos;

    public Tiempo(int hora, int minutos, int segundos) {
        this.horas = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    @Override
    public String toString() {
        return this.horas + "h:" + this.minutos + "m:" + this.segundos + "s";
    }

    public static String sumar(int minutos1, int segundos1, int minutos2, int segundos2) {
        int totalSegundos = segundos1 + segundos2;
        int totalMinutos = minutos1 + minutos2 + totalSegundos / 60;
        int horas = totalMinutos / 60;
        int minutos = totalMinutos % 60;
        int segundos = totalSegundos % 60;
        return horas + "h:" + minutos + "m:" + segundos + "s";
    }
    
}
