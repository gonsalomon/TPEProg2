package TPE.compare;

import java.util.Comparator;

import TPE.Participant;

public abstract class Compare implements Comparator<Participant> {

    public abstract int compare(Participant p1, Participant o2);

}
