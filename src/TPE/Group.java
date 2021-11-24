package TPE;

import java.util.ArrayList;
import TPE.filters.*;

public class Group extends Participant {
    private ArrayList<Participant> miembros;

    public Group(String nombre) {
        super(nombre);
        miembros = new ArrayList<>();
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

    @Override
    public double getAge() {
        double age = 0;
        int members = 0;
        for (Participant p : miembros) {
            age += p.getAge();
            members++;
        }
        return age / members;
    }

    @Override
    public ArrayList<String> getGenList() {
        ArrayList<String> comunes = miembros.get(0).getGenList();
        for (int i = 1; i < miembros.size(); i++) {
            ArrayList<String> evaluados = miembros.get(i).getGenList();
            for (String gen : comunes) {
                if (!evaluados.contains(gen)) {
                    comunes.remove(gen);
                }
            }
        }
        return comunes;
    }

    @Override
    public ArrayList<String> getLangList() {
        ArrayList<String> copy = new ArrayList<>();
        for (int i = 0; i < miembros.size(); i++) {
            for (String lang : miembros.get(i).getLangList()) {
                if (!copy.contains(lang)) {
                    copy.add(lang);
                }
            }
        }
        return copy;
    }

    @Override
    public ArrayList<String> getInstList() {
        ArrayList<String> copy = new ArrayList<>();
        for (int i = 0; i < miembros.size(); i++) {
            for (String inst : miembros.get(i).getInstList()) {
                if (!copy.contains(inst)) {
                    copy.add(inst);
                }
            }
        }
        return copy;
    }

    public ArrayList<Participant> buscar(Filtro f) {
        ArrayList<Participant> copy = new ArrayList<>();
        if (f.cumple(this)) {
            copy.add(this);
        }else{
            for (Participant miembro : miembros) {
                copy.addAll(miembro.buscar(f));
            }
        }
        return copy;
    }
}
