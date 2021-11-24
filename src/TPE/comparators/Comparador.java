package TPE.comparators;

import java.util.Comparator;

import TPE.Participant;
import TPE.Song;

public abstract class Comparador implements Comparator<Participant> {
    private Song song;
    protected Comparador next;

    public Comparador(Song song, Comparador next) {
        this.song = song;
        this.next = next;
    }

    public Song getSong() {
        return song;
    }

    public Comparador getNext() {
        return next;
    }

    public abstract int compare(Participant p1, Participant p2);
}
