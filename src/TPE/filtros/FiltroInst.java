package TPE.filtros;

import java.util.ArrayList;

import TPE.Participant;

public class FiltroInst extends Filtro {
    private ArrayList<String> inst;

    public FiltroInst() {
        this.inst = new ArrayList<String>();
    }

    public boolean cumple(Participant p) {
        for (String i : p.getInstList()) {
            if (this.inst.contains(i)) {
                return true;
            }
        }
        return false;
    }

    // guardo todos los instrumentos en minúscula para evitar agregar Guitarra y
    // guitarra, por ejemplo. lo mismo lo hago en gen y lang
    public void addInst(String s) {
        if (s != null) {
            if (!this.inst.contains(s.toLowerCase())) {
                this.inst.add(s.toLowerCase());
            }
        }
    }

    public void removeInst(String s) {
        if (s != null) {
            if (this.inst.contains(s.toLowerCase())) {
                this.inst.remove(s.toLowerCase());
            }
        }
    }
}
