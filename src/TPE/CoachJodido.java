package TPE;

import java.util.ArrayList;

import TPE.filters.Filtro;

public class CoachJodido extends Coach {
    ArrayList<Filtro> condiciones;

    public CoachJodido(String nombre, String apellido) {
        super(nombre, apellido);
        condiciones = new ArrayList<>();
    }

    public void addCondicion(Filtro condicion) {
        if (condicion != null) {
            if (condiciones.isEmpty()) {
                condiciones.add(condicion);
            } else if (!condiciones.contains(condicion)) {
                condiciones.add(condicion);
            }
        }
    }

    public void delCondicion(Filtro condicion) {
        if (condicion != null) {
            if (condiciones.contains(condicion)) {
                condiciones.remove(condicion);
            }
        }
    }

    @Override
    public void teamAdd(Participant p) {
        if (p != null) {
            for (Filtro f : condiciones) {
                if (!f.cumple(p)) {
                    return;
                }
            }
            if (!team.contains(p)) {
                team.add(p);
            }
        }
    }
}
