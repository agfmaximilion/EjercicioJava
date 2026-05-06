package Abstracto.Spiderman;

public class Traje {

    //Atributos
    private String tipo;
    private int resistencia;
    private int mejoraAtaque;

    //Constructor
    public Traje(String tipo, int resistencia, int mejoraAtaque) {
        this.tipo = tipo;
        this.resistencia = resistencia;
        this.mejoraAtaque = mejoraAtaque;
    }

    //Métodos
    public int absorberDanio(int cantidad) {
        int danio = cantidad - this.resistencia;
        if (danio < 0) {
            return 0;
        }
        return danio;
    }

    public int mejorarAtaque(int base) {
        return base + mejoraAtaque;
    }

    public String toString() {
        return "Traje: " + this.tipo + " | Resistencia: " + this.resistencia + " | Mejora: " + this.mejoraAtaque;
    }
    //Getters y Setters

    public int getMejoraAtaque() {
        return mejoraAtaque;
    }

}
