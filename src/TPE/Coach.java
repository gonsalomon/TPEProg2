package TPE;

import java.util.ArrayList;
import java.util.Collections;

public class Coach {
    private String name;
    private String surname;
    private ArrayList<Participant> team;

    public Coach(String nombre, String apellido) {
        this.name = nombre;
        this.surname = apellido;
        this.team = new ArrayList<Participant>();
    }

    // se necesita poder agregar y sacar gente del equipo
    public void teamAdd(Participant p) {
        if (p != null) {
            if (team != null) {
                team.add(p);
            } else if (!team.contains(p)) {
                team.add(p);
            }
        }
    }

    public void teamRemove(Participant p) {
        if (p != null) {
            if (team.contains(p)) {
                team.remove(p);
            }
        }
    }

    // métodos que pide la consigna
    public ArrayList<String> getTeamInst() {
        ArrayList<String> copy = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            for (String inst : team.get(i).getInstList()) {
                if (!copy.contains(inst)) {
                    copy.add(inst);
                }
            }
        }
        return copy;
    }

    public ArrayList<String> getTeamLang() {
        ArrayList<String> copy = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            for (String lang : team.get(i).getLangList()) {
                if (!copy.contains(lang)) {
                    copy.add(lang);
                }
            }
        }
        return copy;
    }

    public ArrayList<String> getTeamGen() {
        ArrayList<String> copy = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            for (String gen : team.get(i).getGenList()) {
                if (!copy.contains(gen)) {
                    copy.add(gen);
                }
            }
        }
        Collections.sort(copy);
        return copy;
    }

    public double getTeamAgeAVG() {
        int partial = 0;
        for (int i = 0; i < team.size(); i++) {
            partial += this.team.get(i).getAge();
        }
        return partial / team.size();
    }

    // devuelve un group de participantes(sean grupo o solista) que cumplen con la
    // condición
    public Group assembleTeam(Batalla b) {
        Group contestant = new Group("Equipo de " + this.name + " " + this.surname + "!");
        for (int i = 0; i < team.size(); i++) {
            for (int j = 0; j < b.getSongs().size(); j++) {
                if (b.getSongs().get(j).canPerformIt(team.get(i))) {
                    contestant.addMember(team.get(i));
                }
            }
        }
        return contestant;
    }

    // fitros!
    public ArrayList<Participant> getTeamByInst(String inst) {
        ArrayList<Participant> copy = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            for (String inst2 : team.get(i).getInstList()) {
                if (inst2.equals(inst)) {
                    if (!copy.contains(team.get(i))) {
                        copy.add(team.get(i));
                    }
                } else {
                    if (team.get(i).getMembers() != null) {
                        for (int j = 0; j < team.get(i).getMembers().size(); j++) {
                            if (team.get(i).getMembers().get(j).getInstList().contains(inst)) {
                                if (!copy.contains(team.get(i).getMembers().get(j))) {
                                    copy.add(team.get(i).getMembers().get(j));
                                }
                            }
                        }
                    } else {
                        if (team.get(i).getInstList().contains(inst)) {
                            if (!copy.contains(team.get(i))) {
                                copy.add(team.get(i));
                            }
                        }
                    }
                }
            }
        }
        return copy;
    }

    public ArrayList<Participant> getTeamByLang(String lang) {
        ArrayList<Participant> copy = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            for (String lang2 : team.get(i).getLangList()) {
                if (lang2.equals(lang)) {
                    if (!copy.contains(team.get(i))) {
                        copy.add(team.get(i));
                    }
                } else {
                    if (team.get(i).getMembers() != null) {
                        for (int j = 0; j < team.get(i).getMembers().size(); j++) {
                            if (team.get(i).getMembers().get(j).getLangList().contains(lang)) {
                                if (!copy.contains(team.get(i).getMembers().get(j))) {
                                    copy.add(team.get(i).getMembers().get(j));
                                }
                            }
                        }
                    } else {
                        if (team.get(i).getLangList().contains(lang)) {
                            if (!copy.contains(team.get(i))) {
                                copy.add(team.get(i));
                            }
                        }
                    }
                }
            }
        }
        return copy;
    }

    public ArrayList<Participant> getTeamByGen(String gen) {
        ArrayList<Participant> copy = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            for (String gen2 : team.get(i).getGenList()) {
                if (gen2.equals(gen)) {
                    if (!copy.contains(team.get(i))) {
                        copy.add(team.get(i));
                    }
                } else {
                    if (team.get(i).getMembers() != null) {
                        for (int j = 0; j < team.get(i).getMembers().size(); j++) {
                            if (team.get(i).getMembers().get(j).getGenList().contains(gen)) {
                                if (!copy.contains(team.get(i).getMembers().get(j))) {
                                    copy.add(team.get(i).getMembers().get(j));
                                }
                            }
                        }
                    } else {
                        if (team.get(i).getGenList().contains(gen)) {
                            if (!copy.contains(team.get(i))) {
                                copy.add(team.get(i));
                            }
                        }
                    }
                }
            }
        }
        return copy;
    }

    public ArrayList<Participant> getMayoresEnTeam(int age) {
        ArrayList<Participant> copy = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getAge() > age) {
                if (!copy.contains(team.get(i))) {
                    copy.add(team.get(i));
                }
            }
        }
        return copy;
    }

    public ArrayList<Participant> canPlay(Song song) {
        ArrayList<Participant> copy = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            if (song.canPerformIt(team.get(i))) {
                if (!copy.contains(team.get(i))) {
                    copy.add(team.get(i));
                }
            }
        }
        return copy;
    }

    // métodos puramente funcionales (extras)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Participant> getTeam() {
        return new ArrayList<>(this.team);
    }
}