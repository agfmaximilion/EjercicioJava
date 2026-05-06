package Abstracto.Spiderman;

public class Heroe extends Personaje {
    //Atributo

    private int energia;
    private Traje traje;
    private Gadget[] inventario;

    //Constructor
    public Heroe(String nombre, int energia, int nivelPoder, Habilidad[] skills, int vida, Traje traje, Gadget[] inventario1) {
        super(nombre, nivelPoder, vida);

        this.energia = energia;
        this.traje = traje;
        this.inventario = inventario1;

        // 🔥 COPIAR HABILIDADES (ESTO ES LO CLAVE)
        for (int i = 0; i < skills.length; i++) {
            this.getHabilidades()[i] = skills[i];
        }
    }

    //Métodos
    @Override
    public void atacar(Personaje rival) {

        int habi;
        do {
            habi = (int) (Math.random() * this.getHabilidades().length);
        } while (this.getHabilidades()[habi] == null);
        int danio = this.getHabilidades()[habi].getDanio()
                + traje.getMejoraAtaque();
        rival.recibirDanio(danio);
    }

    public boolean esquivar() {
        return Math.random() < 0.3;
    }

    public void usarGadget(int indice, Personaje rival) {
        if (inventario[indice] != null) {
            inventario[indice].usar(rival);
        }
    }

    public void recargarEnergia(int energia) {
        this.energia += energia;
        if (this.energia > 100) {
            this.energia = 100;
        }
    }

    public void cambiarTraje(Traje nuevo) {
        this.traje = nuevo;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\n" + "Traje: "
                + this.traje.toString() + "\n" + "Energia: " + this.energia;
    }
}
