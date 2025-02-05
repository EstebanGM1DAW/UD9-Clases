package RectanguloYPiramide;

public class Rectangulo {
    int altura;
    int ancho;
    static int numRectangulo;

    public Rectangulo(int an,int al){
        this.altura = al;
        this.ancho = an;
        numRectangulo++;
    }

    static public int getRectangulos(){
        return numRectangulo;
    }
    public int getAltura(){
        return altura;
    }
    public int getAncho(){
        return ancho;
    }

    @Override
    public String toString(){
        String mensaje="";
            for (int i = 1;i<=altura;i++){
                for(int j = 1;j<=ancho;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        return mensaje;
    }
}
