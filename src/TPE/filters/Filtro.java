package TPE.filters;

import TPE.Participant;

public abstract class Filtro {
    public Filtro() {
    }

    public abstract boolean cumple(Participant p);
}
