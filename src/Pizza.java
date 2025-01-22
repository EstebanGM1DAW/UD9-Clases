public class Pizza {
    private String tamaño,tipo,estado;
    static int pizzasServidas = 0;
    static int pizzasPedidas = 0;
    //para imprimir el objeto 
    @Override
    public String toString() {
        return "Pizza: " + this.tamaño + ", " + this.tipo + ", " + this.estado;
    }
    //constructor
    public Pizza(String tam, String tipo) {
        this.tamaño = tam;
        this.tipo = tipo;
        this.estado = "pedida";
        pizzasPedidas++;
    }
    //getters
    public String getTamaño() {
        return tamaño;
    }
    public String getTipo() {
        return tipo;
    }
    public String getEstado() {
        return estado;
    }
    public static int getPizzasServidas() {
        return pizzasServidas;
    }
    public static int getPizzasPedidas() {
        return pizzasPedidas;
    }
    //setters
    public void setTamaño(String tam) {
        tamaño = tam;
    }
    public void setTipo(String tip) {
        tipo = tip;
    }
    public void sirve(){
        if (getEstado().equals("pedida")) {
            estado = "servida";
            pizzasServidas++;
        } else {
            if (getEstado().equals("servida")) {
                System.out.println("La pizza ya esta servida.");
            } else {
                System.out.println("No se encontro la pizza");
            }
        }
        
    }
}
