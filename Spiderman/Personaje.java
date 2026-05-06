package Abstracto.Spiderman;

public abstract class Personaje {

    //Atributo
    private String nombre;
    private int nivelPoder;
    private int vida;
    private Habilidad[] habilidades;

    //Constructor
    public Personaje(String nombre, int nivelPoder, int vida) {
        this.nombre = nombre;
        this.nivelPoder = nivelPoder;
        this.vida = vida;
        //Se crea el array con 6 huecos
        this.habilidades = new Habilidad[6];
    }

    //Métodos
    public void recibirDanio(int cantidad) {
        this.vida -= cantidad;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public boolean estaVivo() {
        if (vida != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void usarHabilidad(int indice, Personaje rival) {
        if (habilidades[indice] != null) {
            System.out.println("Se ha usado la habilidad " + this.habilidades[indice].getNombre());
            rival.recibirDanio(habilidades[indice].getDanio());
        }
    }

    public abstract void atacar(Personaje rival);

    //toString
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " | Vida: " + this.vida + " | Poder: " + this.nivelPoder;
    }

    //Getters y Setters
    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public Habilidad[] getHabilidades() {
        return habilidades;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public String getNombre() {
        return nombre;
    }

    
}
