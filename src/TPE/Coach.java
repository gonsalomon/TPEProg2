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

    // tengo que agregar y sacar gente del equipo
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