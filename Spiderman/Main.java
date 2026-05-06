package Abstracto.Spiderman;

public class Main {

    public static void main(String[] args) {

        // =========================
        // 🌆 INICIO
        // =========================
        System.out.println("Nueva York cae en caos...");
        System.out.println("Spider-Man entra en acción\n");

        // =========================
        // 🧠 HABILIDADES
        // =========================
        Habilidad redGolpe = new Habilidad("Golpe de red", 20, 10);
        Habilidad patada = new Habilidad("Patada aérea", 25, 15);

        Habilidad[] habilidadesHeroe = {redGolpe, patada};

        // =========================
        // 🧥 TRAJE
        // =========================
        Traje traje = new Traje("Spider-Tech", 8, 10);

        // =========================
        // 🎒 GADGETS HÉROE
        // =========================
        Gadget redElectrica = new Gadget("Red eléctrica", "Aturde enemigo", 3);
        Gadget humo = new Gadget("Bomba de humo", "Confunde enemigo", 2);

        Gadget[] inventario = {redElectrica, humo};

        // =========================
        // 🕷️ HÉROE
        // =========================
        Heroe spiderman = new Heroe("Spider-Man",100,120,habilidadesHeroe,50,traje,inventario);

        // =========================
        // 🎭 VILLANO: MYSTERIO
        // =========================
        Mysterio mysterio = new Mysterio("Sumir la ciudad en ilusiones","Mysterio",40,90);

        // =========================
        // 🏜️ VILLANO: SANDMAN
        // =========================
        Sandman sandman = new Sandman("Convertir la ciudad en desierto","Sandman",50,110);

        // =========================
        // 🏹 VILLANO: KRAVEN
        // =========================
        Gadget[] arsenalKraven = new Gadget[6];

        Kraven kraven = new Kraven("Cazar al héroe definitivo", "Kraven", 55, 100, arsenalKraven);

        Villano[] villanos = {mysterio, sandman, kraven};
        Heroe[] heroes = {spiderman};

        Ciudad ciudad = new Ciudad("Nueva York", villanos, heroes);
        // =========================
        // 📊 ESTADO INICIAL
        // =========================
        System.out.println("=== ESTADO INICIAL ===");
        System.out.println(spiderman);
        System.out.println(mysterio);
        System.out.println(sandman);
        System.out.println(kraven);

        // =========================
        // ⚔️ ACTIVACIÓN DE PODERES (instanceof)
        // =========================
        System.out.println("\n=== ACTIVACIÓN DE VILLANOS ===");

        if (mysterio instanceof Mysterio) {
            mysterio.crearIlusion();
            System.out.println("Mysterio activa ilusiones");
        }

        if (sandman instanceof Sandman) {
            sandman.transformarse();
            System.out.println("Sandman se vuelve gigante");
        }

        if (kraven instanceof Kraven) {
            kraven.activarModoCazador();
            System.out.println("Kraven entra en modo cazador");
        }

        // =========================
        // 💥 BATALLA
        // =========================
        System.out.println("\n=== INICIO DE BATALLA ===");
        ciudad.iniciarBatalla();

        // =========================
        // 🧾 FINAL
        // =========================
        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println(spiderman);
        System.out.println(mysterio);
        System.out.println(sandman);
        System.out.println(kraven);

        System.out.println("\n🕷️ La batalla termina... por ahora.");
    }
}
