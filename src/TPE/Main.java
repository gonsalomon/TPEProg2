package TPE;

import java.util.Comparator;

import TPE.comparators.*;

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
        // van a poder enfrentarse, disfruten la disputa (casi)extracurricular
        Coach c1 = new Coach("Luis", "Berdún");
        Coach c2 = new Coach("Marcelo", "Armentano");
        // agrupo participants y luego los agrego a los coaches
        Group g1 = new Group("Girls wanna have fun");// (?)
        g1.addMember(g92);
        g1.addMember(j93);
        c2.teamAdd(g1);
        c1.teamAdd(j98);
        // creo un contest y le agrego todas las canciones (tener una clase donde
        // centralizara las funciones de un concurso me pareció oportuno)
        Contest laVozExactas = new Contest();
        laVozExactas.addSong(new Song("Smells Like Teen Spirit"));
        laVozExactas.addSong(new Song("Come As You Are"));
        laVozExactas.addSong(new Song("Creep"));
        laVozExactas.addSong(new Song("Billie Jean"));
        laVozExactas.addSong(new Song("One"));
        laVozExactas.addSong(new Song("In Bloom"));
        laVozExactas.addSong(new FinaleSong("Imagine", 1));
        laVozExactas.addSong(new Song("Bohemian Rhapsody"));
        laVozExactas.addSong(new Song("Hey Jude"));
        laVozExactas.addSong(new Song("Hotel California"));
        // agrego los coaches al contest (con los integrantes ya establecidos)
        laVozExactas.addCoach(c1);
        laVozExactas.addCoach(c2);
        // acá se establecen los comparadores para las batallas, en la 53
        Comparator<Participant> c = new ComparadorInst();
        laVozExactas.setCondicionVictoria(c);
        laVozExactas.compete(c1, c2);
        /*
         * NOTA FINAL: ya sé, tenía que ponerle instrumentos, lenguajes y géneros a cada
         * canción; pero no llegaba bien a sacar cosas innecesarias y tener andando lo
         * que sí se necesitaba. gracias por formarme, fue un cuatrimestre hermoso y
         * esta materia también lo fue. quedaron muchas funciones por emplear en
         * ejecución, pero ninguna daba error ya. PD: quería hacer algo pseudoaleatorio
         * con Math.random y divertirme pensando que estaba desarrollando un juego, o
         * como mínimo, algo como un dado, que es un poquito impredecible
         */
    }
}