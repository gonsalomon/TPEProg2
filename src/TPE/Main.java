package TPE;

public class Main {
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
    }
}