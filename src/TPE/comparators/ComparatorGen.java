package TPE.comparators;

import TPE.Participant;
import TPE.Song;

public class ComparatorGen extends Comparator {
    public ComparatorGen(Song song, Comparator next) {
        super(song, next);
    }

    public int compare(Participant p1, Participant p2) {
        // 1: gana p1. -1: gana p2. 0: empate
        if (p1.getGenList().size() < p2.getGenList().size()) {
            return 1;
        } else if (p1.getGenList().size() > p2.getGenList().size()) {
            return -1;
        } else {
            if (next != null) {
                return next.compare(p1, p2);
            } else {
                return 0;
            }
        }
    }
}
