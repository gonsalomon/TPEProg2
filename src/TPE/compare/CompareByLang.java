package TPE.compare;

import TPE.Participant;

public class CompareByLang extends Compare {
    public CompareByLang() {
        super();
    }

    @Override
    public int compare(Participant p1, Participant p2) {
        return p1.getLangList().size() - p2.getLangList().size();
    }
}
