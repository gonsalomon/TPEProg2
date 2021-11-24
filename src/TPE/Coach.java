package TPE;

import java.util.ArrayList;
import java.util.Collections;

import TPE.comparators.Comparator;
import TPE.filters.Filtro;

public class Coach {
    private String name;
    private String surname;
    protected ArrayList<Participant> team;

    public Coach(String nombre, String apellido) {
        this.name = nombre;
        this.surname = apellido;
        this.team = new ArrayList<Participant>();
    }

    // se necesita poder agregar y sacar gente del equipo
    public void teamAdd(Participant p) {
        if (p != null) {
            if (team == null) {
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
        Collections.sort(copy);
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

    public ArrayList<Participant> buscar(Filtro f) {
        ArrayList<Participant> copy = new ArrayList<>();
        for (Participant p : this.team) {
            copy.addAll(p.buscar(f));
        }
        return copy;
    }

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

    // protejo el getTeam, pero se puede hacer un assembleTeam para una song vacía
    // en requerimientos y se bypassea el protected
    protected ArrayList<Participant> getTeam() {
        return new ArrayList<>(this.team);
    }

    public Group assembleTeam(Comparator c) {
        // el armado de este string se hace para dar un nombre único al grupo, no para
        // println! los println están en el main
        Group copy = new Group(
                "Equipo de " + this.name + " " + this.surname + " para la canción: " + c.getSong().getTitle() + "!");
        for (int i = 0; i < team.size(); i++) {
            // armar team para la cancion s, con un new comparator
        }
        return copy;
    }
}