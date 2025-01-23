package Entradas;

public class Zona {
    private int entradasPorVender;
    public Zona(int n){
        entradasPorVender = n;
    }
    public int getEntradasPorVender(){
        return entradasPorVender;
    }
    public void vender(int n){
        if (this.entradasPorVender==0) {
            System.out.println("Las entradas de esa zona estan agotadas");
        } else if (this.entradasPorVender<=n) {
            System.out.println("Solo quedan "+this.entradasPorVender+"en esa zona.");
        }
        if (entradasPorVender>=n) {
            entradasPorVender -= n;
            System.out.println("Aqui tiene sus "+n+" entradas,gracias.");
        }
    }
}
