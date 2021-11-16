package TPE;

import java.util.ArrayList;

import TPE.compare.*;

public class Main {
    /*
     * los filters ya están ahí, pero no vengo con suficiente tiempo como para
     * probarlos en un main
     */
    public static void main(String[] args) {
        // desconozco si esta gente existe/existió
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
        // creo un contest y le agrego todas las canciones en SongList.addSongs()
        Contest laVozExactas = new Contest();
        SongList sample = new SongList();
        sample.addSongs();
        for (Song s : sample.getSongs()) {
            laVozExactas.addSong(s);
        }
        // agrego los coaches
        laVozExactas.addCoach(c1);
        laVozExactas.addCoach(c2);
        // comparators para las batallas
        ArrayList<Compare> conds = new ArrayList<Compare>();
        conds.add(new CompareByInst());
        conds.add(new CompareByLang());
        conds.add(new CompareByGen());
        conds.add(new CompareByAge());
        // agrego las batallas y las canciones pseudoaleatorias a cada batalla
        for (int i = 0; i < 3; i++) {
            ArrayList<Song> smallerList = new ArrayList<Song>();
            for (int j = 0; j < 3; j++) {
                /* algo de RNG: de las canciones que tengo, elijo 3 al azar */
                Song s = sample.getSongs().get((int) (Math.random() * 20));
                smallerList.add(s);
            }
            laVozExactas.addBattle(new Batalla(c1, c2, smallerList));
        }
        // FIGHT!
        for (int k = 0; k < laVozExactas.getBattles().size(); k++) {// un programa puede tener más de una batalla
            Batalla b = laVozExactas.getBattles().get(k);
            System.out.println(b.getC1().getName() + " vs " + b.getC2().getName() + ".");
            System.out.println("Esta es la batalla n° " + (k + 1) + " de la noche!");
            for (int i = 0; i < b.getSongs().size(); i++) {
                System.out.println("La canción " + (i + 1) + " es " + b.getSongs().get(i).getTitle() + "!");
                System.out.println("Y el ganador es...");
                /*
                 * algo de RNG para el concurso, de nuevo. Lo explico: lo aleatorio es para
                 * saber qué condición se va a aplicar para cada competencia, pero sobre result
                 * guardo el resultado de la competencia.
                 */
                int factorRNG = (int) (Math.random() * conds.size());
                int result = b.compete(conds.get(factorRNG));
                if (result == 0) {
                    System.out.println("Ninguno, es un empate!");
                } else if (result == 1) {
                    System.out.println("El equipo de " + b.getC1().getName() + " gana!");
                } else {
                    System.out.println("El equipo de " + b.getC2().getName() + " gana!");
                }
            }
        }
    }
}