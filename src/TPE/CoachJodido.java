package TPE;

import java.util.ArrayList;

import TPE.filters.Filtro;

public class CoachJodido extends Coach {
    ArrayList<Filtro> condiciones;

    public CoachJodido(String nombre, String apellido) {
        super(nombre, apellido);
        condiciones = new ArrayList<>();
    }

    // necesito poder agregar/borrar las condiciones para que en tiempo de ejecución
    // se pueda hacer lo que pide la consigna
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
            if (!condiciones.isEmpty()) {
                int condicionesCumplidas = 0;
                for (Filtro condicion : condiciones) {
                    if (condicion.cumple(p)) {
                        condicionesCumplidas++;
                    }
                }
                // si cumple todas las condiciones que tengo, que entre a mi team
                if (condicionesCumplidas == condiciones.size()) {
                    super.teamAdd(p);
                }
            }
        }
    }
}
