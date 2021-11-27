package TPE.comparators;

import java.util.Comparator;

import TPE.Participant;

public class ComparadorAge implements Comparator<Participant> {
    public int compare(Participant p1, Participant p2) {
        return (int) (p1.getAge() - p2.getAge());
    }
}