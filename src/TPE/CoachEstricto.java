package TPE;

import TPE.filters.Filtro;

public class CoachEstricto extends Coach {
    /*
     * con filtros AND se pueden meter cuantos filtros se deseen mediante
     * setCondicion: esto representa las exigencias que tendría el coach estricto
     */
    Filtro condicion;

    public CoachEstricto(String nombre, String apellido, Filtro condicion) {
        super(nombre, apellido);
        this.condicion = condicion;
    }

    public void setCondicion(Filtro condicion) {
        this.condicion = condicion;
    }

    @Override
    public void teamAdd(Participant p) {
        if (p != null) {
            /*
             * nunca imaginé que pudiera ser tan sencillo agregarle requerimientos a una
             * clase, el conocimiento va derechito al prefi
             */
            if (condicion != null && condicion.cumple(p)) {
                super.teamAdd(p);
            }
        }
    }
}
