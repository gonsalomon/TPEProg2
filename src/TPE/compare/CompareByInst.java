package TPE.compare;

import TPE.Participant;

public class CompareByInst extends Compare {
    public CompareByInst() {
        super();
    }

    @Override
    public int compare(Participant p1, Participant p2) {
        return p1.getInstList().size() - p2.getInstList().size();
    }
}
