package Entradas;

import java.util.Scanner;

public class ZonaPrueba {
    public static void main(String[] args) {
        int menu = 0;
        Scanner entrada = new Scanner(System.in);

        Zona principal = new Zona(1000);
        Zona compraventa = new Zona(250);
        Zona vip = new Zona(25);
        do {
            System.out.println("1.Ver entradas disponibles");
            System.out.println("2.Comprar entradas");
            System.out.println("3.Salir\n");
            menu = entrada.nextInt();
            entrada.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("Zona Principal: " + principal.getEntradasPorVender());
                    System.out.println("Zona Compra Venta: " + compraventa.getEntradasPorVender());
                    System.out.println("Zona Vip: " + vip.getEntradasPorVender());
                    break;
                case 2:
                    int zonaElegida;
                    do {
                        System.out.println("¿Que zona quieres?");
                        System.out.println("1.Principal");
                        System.out.println("2.CompraVenta");
                        System.out.println("3.Vip");
                        System.out.println("4.Salir");
                        zonaElegida = entrada.nextInt();
                        entrada.nextLine();
                        if (zonaElegida != 4) {
                            System.out.println("¿Cuantas?");
                            int numEntradas = entrada.nextInt();
                            entrada.nextLine();
                            switch (zonaElegida) {
                                case 1:
                                    principal.vender(numEntradas);
                                    break;
                                case 2:
                                    compraventa.vender(numEntradas);
                                    break;
                                case 3:
                                    vip.vender(numEntradas);
                                    break;
                            }
                        }
                    } while (zonaElegida != 4);
                    break;
            }

        } while (menu != 3);
        entrada.close();
    }
}
