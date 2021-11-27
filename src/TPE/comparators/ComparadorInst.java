package TPE.comparators;

import java.util.Comparator;

import TPE.Participant;

public class ComparadorInst implements Comparator<Participant> {
    public int compare(Participant p1, Participant p2) {
        return p1.getInstList().size() - p2.getInstList().size();
    }
}
