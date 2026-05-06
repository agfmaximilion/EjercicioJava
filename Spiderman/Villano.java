package Abstracto.Spiderman;

public class Villano extends Personaje {

    //Atributo
    String planMalvado;
    int nivelAmenaza;

    public Villano(String planMalvado, String nombre, int nivelPoder, int vida) {
        super(nombre, nivelPoder, vida);
        this.planMalvado = planMalvado;
        this.nivelAmenaza = (int) (Math.random() * 10 + 1);
    }

    @Override
    public void atacar(Personaje rival) {
        rival.setVida(rival.getVida() - this.getNivelPoder());
    }

    public void ejecutarPlan() {
        System.out.println(this.planMalvado);
    }

    public void intimidar() {
        System.out.println("Muajaja soy malo");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Nivel de Amenaza: " + this.nivelAmenaza;
    }

}
