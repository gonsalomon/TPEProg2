package TPE.comparators;

import java.util.Comparator;

import TPE.Participant;

public class ComparadorNOT implements Comparator<Participant> {
    private Comparator<Participant> inverse;

    public ComparadorNOT(Comparator<Participant> comparator) {
        this.inverse = comparator;
    }

    @Override
    public int compare(Participant p1, Participant p2) {
        return -1 * inverse.compare(p1, p2);
    }
}
