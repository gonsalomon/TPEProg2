package TPE.filters;

import TPE.Participant;

public class FiltroLang extends Filtro {

    private String langBuscado;

    public FiltroLang(String lang) {
        this.langBuscado = lang;
    }

    public boolean cumple(Participant p) {
        if (p != null) {
            if (p.getLangList().contains(langBuscado)) {
                return true;
            }
        }
        return false;
    }
}
