package TPE.filters;

import java.util.ArrayList;

import TPE.Participant;

public class FiltroGen extends Filtro {
    private ArrayList<String> gens;

    public FiltroGen() {
        this.gens = new ArrayList<String>();
    }

    public boolean cumple(Participant p) {
        for (String gen : this.gens) {
            if (p.getGenList().contains(gen)) {
                return true;
            }
        }
        return false;
        // return this.gens.contains(genero);
    }
}
