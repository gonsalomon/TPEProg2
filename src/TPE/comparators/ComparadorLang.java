package TPE.comparators;

import java.util.Comparator;

import TPE.Participant;

public class ComparadorLang implements Comparator<Participant> {
    @Override
    public int compare(Participant p1, Participant p2) {
        return p1.getLangList().size() - p2.getLangList().size();
    }
}
