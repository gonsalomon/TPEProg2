package TPE.filters;

import TPE.Participant;

public class FiltroNOT extends Filtro {

    private Filtro filtro;

    public FiltroNOT(Filtro filtro) {
        this.filtro = filtro;
    }

    @Override
    public boolean cumple(Participant p) {
        return !filtro.cumple(p);
    }
}
