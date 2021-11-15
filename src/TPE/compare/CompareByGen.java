package TPE.compare;

import TPE.Participant;

public class CompareByGen extends Compare {
    public CompareByGen() {
        super();
    }

    @Override
    public int compare(Participant p1, Participant p2) {
        return p2.getGenList().size() - p1.getGenList().size();
    }
}
