package TPE;

import java.util.ArrayList;

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
        ArrayList<String> copy = new ArrayList<>();
        for (int i = 0; i < miembros.size(); i++) {
            // TODO 1: problema con la intersección
        }
        return copy;
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
}
