package TPE.compare;

import TPE.Participant;

public class CompareByAge extends Compare {
    public CompareByAge() {
        super();
    }

    @Override
    public int compare(Participant p1, Participant p2) {
        return Double.compare(p1.getAge(), p2.getAge());
    }
}
