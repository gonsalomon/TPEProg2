package TPE.comparators;

import TPE.Participant;
import TPE.Song;

public class ComparatorAND extends Comparator {
    private Comparator c1;
    private Comparator c2;

    public ComparatorAND(Song song, Comparator next, Comparator c1, Comparator c2) {
        super(song, next);
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Participant p1, Participant p2) {
        // 1: gana p1. -1: gana p2. 0: empate
        int res1 = c1.compare(p1, p2);
        int res2 = c2.compare(p1, p2);
        if (res1 == 1 && res2 == 1) {// gana p1 los 2
            return 1;
        } else if (res1 == -1 && res2 == -1) {// gana p2 los 2
            return -1;
        } else {
            /*
             * si no hay victoria decisiva, es empate. en ese caso, si no hay next, devuelvo
             * empate. de haberlo, lo devuelvo.
             */
            if (next != null) {
                return next.compare(p1, p2);
            } else {
                return 0;
            }
        }
    }
}
