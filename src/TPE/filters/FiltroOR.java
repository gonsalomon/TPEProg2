package TPE.filters;

import TPE.Participant;

public class FiltroOR extends Filtro {
    private Filtro filtro1;
    private Filtro filtro2;

    public FiltroOR(Filtro filtro1, Filtro filtro2) {
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }

    @Override
    public boolean cumple(Participant p) {
        return filtro1.cumple(p) || filtro2.cumple(p);
    }
}
