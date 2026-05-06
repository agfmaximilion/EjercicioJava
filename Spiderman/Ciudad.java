package Abstracto.Spiderman;

public class Ciudad {

    //Atributos
    String nombre;
    Villano[] villanos;
    Heroe[] heroes;

    public Ciudad(String nombre, Villano[] villanos, Heroe[] heroes) {
        this.nombre = nombre;
        this.villanos = villanos;
        this.heroes = heroes;
    }

    public void iniciarBatalla() {
        //Porque solo está Spidey
        Heroe hero = heroes[0];
        //Para recorrer los villanos
        for (int i = 0; i < villanos.length; i++) {
            //Así se saca a la clase integrante
            //Todos son villanos, pero son diferentes clases
            Villano enemigo = villanos[i];
            if (enemigo instanceof Mysterio) {
                //Se castea, porque si no Java no sabe
                ((Mysterio) enemigo).crearIlusion();
            } else if (enemigo instanceof Sandman) {
                ((Sandman) enemigo).transformarse();
            } else if (enemigo instanceof Kraven) {
                ((Kraven) enemigo).activarModoCazador();
            }
            //Villano Ataca a Heroe
            if (hero.esquivar()) {
                System.out.println("🕷️ Esquiva el ataque");
            } else {
                enemigo.atacar(hero);
            }

            hero.atacar(enemigo);

            System.out.println(hero);
            System.out.println(enemigo);
            //Muestro datos
            hero.toString();
            villanos[i].toString();
        }
    }

    //toString
    @Override
    public String toString() {

        String info = " ";
        info += this.nombre + "\n";
        info += "-----------------\n";
        info += "--- Heroes ---\n";

        if (heroes != null) {
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i] != null) {
                    info += heroes[i].toString() + "\n";
                }
            }
        }

        info += "--- Villanos ---\n";

        if (villanos != null) {
            for (int i = 0; i < villanos.length; i++) {
                if (villanos[i] != null) {
                    info += villanos[i].toString() + "\n";
                }
            }
        }

        return info;
    }

}
