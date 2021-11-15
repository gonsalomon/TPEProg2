package TPE.filtros;

import TPE.Participant;

public abstract class Filtro {
    public Filtro() {
    }

    public abstract boolean cumple(Participant p);
    /*
     * aclaración: la complejidad n cuadrado que va a terminar teniendo este método
     * me duele en el alma pero más me dolería no entregar el tpe a tiempo. sé que
     * se repite el método entre lang, inst y gen; pero es necesario porque no se
     * puede abstraer el comportamiento en filtro (hay que usar getGenList,
     * getLangList y getInstList según el caso...)
     */
}
