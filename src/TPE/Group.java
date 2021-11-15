package TPE;

import java.util.ArrayList;

import TPE.compare.*;

public class Group extends Participant {
    private ArrayList<Participant> miembros;
    private Compare cond;

    public Group(String nombre, Compare cond) {
        super(nombre, 0);
        miembros = new ArrayList<Participant>();
        this.cond = cond;
    }

    // métodos asociados a miembros de un grupo
    public void addMember(Participant p) {
        if (p != null) {
            if (!miembros.contains(p)) {
                miembros.add(p);
            }
        }
    }

    public void delMember(Participant p) {
        if (p != null) {
            if (miembros.contains(p)) {
                miembros.remove(p);
            }
        }
    }

    public ArrayList<Participant> getMembers() {
        return new ArrayList<Participant>(miembros);
    }

    // métodos asociados a preferencias de un grupo
    public void addGenPref(String gen) {
        if (gen != null) {
            int i = 0;
            for (Participant p : miembros) {
                if (p.getGenList().contains(gen)) {
                    i++;
                }
            }
            if (i == miembros.size()) {
                genList.add(gen);
            }
        }
    }

    public void delGenPref(String gen) {
        if (gen != null) {
            if (genList.contains(gen)) {
                genList.remove(gen);
            }
        }
    }

    @Override
    public ArrayList<String> getGenList() {
        return new ArrayList<String>(genList);
    }

    public void addLangPref(String lang) {
        if (lang != null) {
            if (!langList.contains(lang)) {
                langList.add(lang);
            }
        }
    }

    public void delLangPref(String lang) {
        if (lang != null) {
            if (langList.contains(lang)) {
                langList.remove(lang);
            }
        }
    }

    @Override
    public ArrayList<String> getLangList() {
        return new ArrayList<String>(langList);
    }

    public void addInstPref(String inst) {
        if (inst != null) {
            if (!instList.contains(inst)) {
                instList.add(inst);
            }
        }
    }

    public void delInstPref(String inst) {
        if (inst != null) {
            if (instList.contains(inst)) {
                instList.remove(inst);
            }
        }
    }

    @Override
    public ArrayList<String> getInstList() {
        return new ArrayList<String>(instList);
    }

    @Override
    public double getAge() {
        double age = 0;
        for (Participant p : miembros) {
            age += p.getAge();
        }
        return age / miembros.size();
    }

    @Override
    public int compareTo(Participant p) {
        return cond.compare(this, p);
    }
}
