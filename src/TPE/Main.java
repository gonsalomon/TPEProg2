package TPE;

import java.util.ArrayList;

import TPE.compare.Compare;
import TPE.compare.CompareByAge;
import TPE.compare.CompareByInst;

public class Main {
    /*
     * los filters ya están ahí, pero no vengo con suficiente tiempo como para
     * probarlos en un main
     */
    public static void main(String[] args) {
        // desconozco si estas personas existen
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
        // acá ya no son tan desconocidos
        Coach c1 = new Coach("Luis", "Berdún");
        Coach c2 = new Coach("Marcelo", "Armentano");

        Group g1 = new Group("Ellas");
        g1.addMember(g92);
        g1.addMember(j93);

        c2.teamAdd(g1);
        c1.teamAdd(j98);

        Contest c = new Contest();

        c.addCoach(c1);
        c.addCoach(c2);
        c.addParticipant(g1);
        c.addParticipant(j98);

        ArrayList<Compare> daRules = new ArrayList<Compare>();
        CompareByInst reglaInst = new CompareByInst();

        daRules.add(reglaInst);

        System.out.println(c.batalla(g1, j98, daRules));

        CompareByAge reglaEdad = new CompareByAge();
        daRules.add(reglaEdad);
        daRules.remove(reglaInst);

        System.out.println(c.batalla(g1, j98, daRules));
        /*
         * falta poner a prueba el de la cantidad de géneros, y añadir más personas, lo
         * de la cant de géneros va a continuación, pero para
         */
    }
}