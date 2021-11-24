package TPE.comparators;

import TPE.Participant;
import TPE.Song;

public class ComparadorNOT extends Comparador {
    private Comparador comparator;

    public ComparadorNOT(Song song, Comparador next, Comparador comparator) {
        super(song, next);
        this.comparator = comparator;
    }

    @Override
    public int compare(Participant p1, Participant p2) {
        return -1 * comparator.compare(p1, p2);
    }
}
