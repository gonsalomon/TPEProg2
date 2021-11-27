package TPE.comparators;

import java.util.Comparator;

import TPE.Participant;

public class ComparadorAND implements Comparator<Participant> {
    private Comparator<Participant> c1;
    private Comparator<Participant> c2;

    public ComparadorAND(Comparator<Participant> c1, Comparator<Participant> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Participant p1, Participant p2) {
        int result = c1.compare(p1, p2);
        if (result == 0) {
            result = c2.compare(p1, p2);
        }
        return result;
    }
}
