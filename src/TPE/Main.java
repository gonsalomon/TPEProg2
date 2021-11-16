package TPE;

import java.util.ArrayList;

import TPE.compare.*;

public class Main {
    /*
     * los filters ya están ahí, pero no vengo con suficiente tiempo como para
     * probarlos en un main
     */
    public static void main(String[] args) {
        // vamos a traer buenas bandas/cantantes del pasado

        Member j98 = new Member("Juan Manuel", "Pérez", 23);
        j98.addInst("Guitarra");
        j98.addInst("Voz");
        j98.addLang("Español");
        j98.addGen("Rock nacional");
        j98.addGen("Rock alternativo");
        j98.addGen("Melódico");
        Member g92 = new Member("Graciela", "Torres", 29);
        g92.addInst("Voz");
        g92.addLang("Inglés");
        g92.addLang("Español");
        g92.addGen("Pop");
        g92.addGen("Melódico");
        Member j93 = new Member("Juliana", "Fernández", 28);
        j93.addInst("Piano");
        j93.addLang("Español");
        j93.addLang("Inglés");
        j93.addGen("Rock nacional");
        j93.addGen("Pop");
        // van a poder enfrentarse gracias a un RNG, enjoy
        Coach c1 = new Coach("Luis", "Berdún");
        Coach c2 = new Coach("Marcelo", "Armentano");
        // agrupo participants y luego los agrego a los coaches
        Group g1 = new Group("Ellas");
        g1.addMember(g92);
        g1.addMember(j93);

        c2.teamAdd(g1);
        c1.teamAdd(j98);
        // creo un contest
        Contest laVozExactas = new Contest();
        // agrego los coaches
        laVozExactas.addCoach(c1);
        laVozExactas.addCoach(c2);
        // comparators para las batallas
        ArrayList<Compare> conds = new ArrayList<Compare>();
        conds.add(new CompareByInst());
        conds.add(new CompareByLang());
        conds.add(new CompareByGen());
        conds.add(new CompareByAge());

        // FIGHT!
        for (Batalla b : laVozExactas.getBattles()) {// un programa puede tener más de una batalla
            System.out.println(b.getC1().getName() + " vs " + b.getC2().getName() + "!");
            for (int i = 0; i < b.getSongs().size(); i++) {
                System.out.println("La canción " + i + " es " + b.getSongs().get(i).getTitle() + "!");
                /*
                 * algo de RNG para el concurso (?) Lo explico: lo aleatorio es para saber qué
                 * condición se va a aplicar para cada competencia, pero sobre result guardo el
                 * resultado de la competencia.
                 */
                int result = b.compete(conds.get((int) Math.round(Math.random() * conds.size())));

                if (result == 0) {
                    System.out.println("Empate!");
                } else if (result == 1) {
                    System.out.println("El equipo de " + b.getC1().getName() + " gana!");
                } else {
                    System.out.println("El equipo de " + b.getC2().getName() + " gana!");
                }
            }
        }
    }
}