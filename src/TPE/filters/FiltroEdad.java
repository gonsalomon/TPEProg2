package TPE.filters;

import TPE.Participant;

public class FiltroEdad extends Filtro {

    private int edadBuscada;

    public FiltroEdad(int edad) {
        this.edadBuscada = edad;
    }

    @Override
    public boolean cumple(Participant p) {
        if (p != null) {
            if (p.getAge() == edadBuscada) {
                return true;
            }
        }
        return false;
    }
    
}
