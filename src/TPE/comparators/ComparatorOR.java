package TPE.comparators;

import TPE.Participant;
import TPE.Song;

public class ComparatorOR extends Comparator {
    Comparator c1;
    Comparator c2;

    public ComparatorOR(Song song, Comparator next, Comparator c1, Comparator c2) {
        super(song, next);
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Participant p1, Participant p2) {
        // 1: gana p1. -1: gana p2. 0: empate
        int res1 = c1.compare(p1, p2);
        int res2 = c2.compare(p1, p2);
        /* chequeo casos empate, de otra manera, se decide quién gana */
        if (res1 + res2 == 0) {
            if (next != null) {
                return next.compare(p1, p2);
            } else {
                return 0;
            }
        } else {
            if (res1 + res2 < 0) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
