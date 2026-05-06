package Abstracto.Spiderman;

public class Gadget {

    //Atributos
    private String nombre;
    private String efecto;
    private int usos;

    //Constructor
    public Gadget(String nombre, String efecto, int par) {
        this.nombre = nombre;
        this.efecto = efecto;
        this.usos = 3;
    }

    //Métodos
    public void usar(Personaje rival) {
        if (usos > 0) {
            usos--;
            if ((rival.getVida() - 10) > 0) {
                rival.setVida(rival.getVida() - 10);
            } else {
                rival.setVida(0);
            }
            System.out.println("Efecto: " + this.efecto);
        } else {
            System.out.println("Sin usos posibles");
        }
    }

    public void recargar() {
        this.usos = 3;
    }

    public String toString() {
        String info = "";
        info += "Gadget: " + this.nombre + " | Usos: " + this.usos;
        return info;
    }
}
