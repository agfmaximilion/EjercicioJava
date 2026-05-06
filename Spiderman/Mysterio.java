package Abstracto.Spiderman;

public class Mysterio extends Villano {

    //Atributos
    int nivelIlusion;
    boolean ilusionesActivas;

    public Mysterio(String planMalvado, String nombre, int nivelPoder, int vida) {
        super(planMalvado, nombre, nivelPoder, vida);
        this.nivelIlusion = 8;
        this.ilusionesActivas = false;
    }

    public void crearIlusion() {
        this.ilusionesActivas = true;
    }

    public void desactivarIlusion() {
        this.ilusionesActivas = false;
    }

    @Override
    public void atacar(Personaje rival) {
        if (ilusionesActivas) {
            rival.recibirDanio((this.getNivelPoder() + this.nivelIlusion));
        } else {
            rival.recibirDanio(this.getNivelPoder());
        }
    }

    @Override
    public void recibirDanio(int cantidad) {

        boolean evitaDanio = ilusionesActivas && Math.random() < 0.5;

        if (!evitaDanio) {
            this.setVida(this.getVida() - cantidad);

            if (this.getVida() < 0) {
                this.setVida(0);
            }
        }
    }

    @Override
    public String toString() {
        String info = "";
        info += super.toString() + " Nivel de Ilusion: " + this.nivelIlusion + " | ";
        if (ilusionesActivas) {
            info += "Ilusiones Activas";
        } else {
            info += "Ilusiones NO Activadas";
        }
        return info;
    }
}
