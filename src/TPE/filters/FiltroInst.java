package TPE.filters;

import TPE.Participant;

public class FiltroInst extends Filtro {
    private String instBuscado;

    public FiltroInst(String inst) {
        this.instBuscado = inst;
    }

    public boolean cumple(Participant p) {
        if (p != null) {
            if (p.getInstList().contains(instBuscado)) {
                return true;
            }
        }
        return false;
    }
}
