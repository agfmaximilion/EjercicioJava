package Abstracto.Spiderman;

public class Kraven extends Villano {

    int nivelCaza;
    boolean modoCazador;
    Gadget[] arsenal;

    public Kraven(String planMalvado, String nombre, int nivelPoder, int vida, Gadget[] arsenal) {
        super(planMalvado, nombre, nivelPoder, vida);
        this.nivelCaza = 9;
        this.modoCazador = false;
        this.arsenal = arsenal;
    }

    //Métodos
    public void activarModoCazador() {
        this.modoCazador = true;
    }

    public void desactivarModoCazador() {
        this.modoCazador = false;
    }

    public void usarGadget(int indice, Personaje rival) {

        if (indice >= 0 && indice < arsenal.length && arsenal[indice] != null) {
            arsenal[indice].usar(rival);
        }
    }

    @Override
    public void atacar(Personaje rival) {
        if (modoCazador) {
            rival.recibirDanio(this.getNivelPoder() + this.nivelCaza);
        } else {
            rival.recibirDanio(this.getNivelPoder());
        }
    }

    @Override
    public void recibirDanio(int cantidad) {

        boolean esquiva = modoCazador && Math.random() < 0.25;

        if (!esquiva) {
            this.setVida(this.getVida() - cantidad);

            if (this.getVida() < 0) {
                this.setVida(0);
            }
        }
    }

    @Override
    public String toString() {
        String info = "";
        info += super.toString() + " Nivel de Caza: " + this.nivelCaza + " | ";
        if (modoCazador) {
            info += "Modo Cazador Activo";
        } else {
            info += "Modo Cazador NO Activo";
        }
        return info;
    }
}
