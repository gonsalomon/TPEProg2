package TPE.filters;

import TPE.Participant;

public class FiltroGen extends Filtro {
    private String genBuscada;

    public FiltroGen(String gen) {
        this.genBuscada = gen;
    }

    public boolean cumple(Participant p) {
        if (p != null) {
            if (p.getGenList().contains(genBuscada)) {
                return true;
            }
        }
        return false;
    }
}
