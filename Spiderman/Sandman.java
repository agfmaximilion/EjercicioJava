package Abstracto.Spiderman;

public class Sandman extends Villano {

    //Atributo
    int cantidadArena;
    boolean formaGigante;//T si, F no

    public Sandman(String planMalvado, String nombre, int nivelPoder, int vida) {
        super(planMalvado, nombre, nivelPoder, vida);
        this.cantidadArena = 100;
        this.formaGigante = false;
    }

    //Métodos
    public void transformarse() {
        this.formaGigante = true;
    }

    public void desmoronarse() {
        this.formaGigante = false;
    }

    @Override
    public void atacar(Personaje rival) {
        if (formaGigante) {
            rival.recibirDanio(this.getNivelPoder() + 20);
        } else {
            rival.recibirDanio(this.getNivelPoder());
        }
    }

    @Override
    public void recibirDanio(int cantidad) {
        this.setVida(this.getVida() - (cantidad / 2));
        if (this.getVida() < 0) {
            this.setVida(0);
        }
    }

    @Override
    public String toString() {
        String info = "";
        info += super.toString() + " Cantidad de Arena: " + this.cantidadArena + " | ";
        if (formaGigante) {
            info += "Forma Gigante Activa";
        } else {
            info += "Forma Gigante NO Activadas";
        }
        return info;
    }
}
