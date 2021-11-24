package TPE.comparators;

import TPE.Participant;
import TPE.Song;

public class ComparatorNOT extends Comparator {
    private Comparator comparator;

    public ComparatorNOT(Song song, Comparator next, Comparator comparator) {
        super(song, next);
        this.comparator = comparator;
    }

    @Override
    public int compare(Participant p1, Participant p2) {
        return -1 * comparator.compare(p1, p2);
    }
}
