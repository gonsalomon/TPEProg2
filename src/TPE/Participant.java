package TPE;

import java.util.ArrayList;
import TPE.filters.*;

public abstract class Participant {
    protected String name;

    public Participant(String name) {
        this.name = name;
    }

    public abstract double getAge();

    public String getName() {
        return name;
    }

    public abstract ArrayList<Participant> buscar(Filtro f);

    public abstract ArrayList<String> getGenList();

    public abstract ArrayList<String> getLangList();

    public abstract ArrayList<String> getInstList();

    public abstract ArrayList<Participant> getMembers();
}
