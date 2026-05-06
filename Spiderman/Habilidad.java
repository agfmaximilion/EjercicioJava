package Abstracto.Spiderman;

public class Habilidad {

    //Atributo
    private String nombre;
    private int danio;
    private int costeEnergia;

    //Constructor
    public Habilidad(String nombre, int danio, int costeEnergia) {
        this.nombre = nombre;
        this.danio = danio;
        this.costeEnergia = costeEnergia;
    }

    public void usar() {
        System.out.println("Usando habilidad: " + this.nombre);
    }

    //toString
    @Override
    public String toString() {
        String info = "";
        info += "Habilidad: " + this.nombre + " (Danio: " + this.danio + ", Coste: " + this.costeEnergia + ")";
        return info;
    }

    //Getter y Setters
    public int getDanio() {
        return danio;
    }

    public int getCosteEnergia() {
        return costeEnergia;
    }

    public String getNombre() {
        return nombre;
    }

}
