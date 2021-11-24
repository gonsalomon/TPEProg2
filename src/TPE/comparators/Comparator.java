package TPE.comparators;

import TPE.Participant;
import TPE.Song;

public abstract class Comparator {
    private Song song;
    protected Comparator next;

    public Comparator(Song song, Comparator next) {
        this.song = song;
        this.next = next;
    }

    public Song getSong() {
        return song;
    }

    public Comparator getNext() {
        return next;
    }

    public abstract int compare(Participant p1, Participant p2);
}
