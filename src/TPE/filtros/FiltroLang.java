package TPE.filtros;

import java.util.ArrayList;

import TPE.Participant;

public class FiltroLang extends Filtro {

    private ArrayList<String> lang;

    public FiltroLang() {
        this.lang = new ArrayList<String>();
    }

    public boolean cumple(Participant p) {
        for (String l : lang) {
            if (p.getLangList().contains(l)) {
                return true;
            }
        }
        return false;
    }

    public void addLang(String s) {
        if (s != null) {
            if (!lang.contains(s.toLowerCase())) {
                lang.add(s.toLowerCase());
            }
        }
    }

    public void removeLang(String s) {
        if (s != null) {
            if (lang.contains(s.toLowerCase())) {
                lang.remove(s.toLowerCase());
            }
        }
    }
}
