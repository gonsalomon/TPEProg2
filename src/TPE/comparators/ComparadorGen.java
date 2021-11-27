package TPE.comparators;

import java.util.Comparator;

import TPE.Participant;

public class ComparadorGen implements Comparator<Participant> {

    public int compare(Participant p1, Participant p2) {
        return p1.getGenList().size() - p2.getGenList().size();
    }
}
