package TPE;

import java.util.ArrayList;
import TPE.filters.*;

public class Member extends Participant {
    private int age;
    private ArrayList<String> genList;
    private ArrayList<String> langList;
    private ArrayList<String> instList;

    public Member(String name, String surname, int age) {
        super(name + " " + surname);
        this.genList = new ArrayList<>();
        this.langList = new ArrayList<>();
        this.instList = new ArrayList<>();
    }

    // formas de manejar arraylists
    public void addGen(String gen) {
        if (gen != null) {
            if (!genList.contains(gen)) {
                this.genList.add(gen);
            }
        }
    }

    public void addLang(String lang) {
        if (lang != null) {
            if (!langList.contains(lang)) {
                this.langList.add(lang);
            }
        }
    }

    public void addInst(String inst) {
        if (inst != null) {
            if (!instList.contains(inst)) {
                this.instList.add(inst);
            }
        }
    }

    public void delGen(String gen) {
        if (gen != null) {
            if (genList.contains(gen)) {
                this.genList.remove(gen);
            }
        }
    }

    public void delLang(String lang) {
        if (lang != null) {
            if (langList.contains(lang)) {
                this.langList.remove(lang);
            }
        }
    }

    public void delInst(String inst) {
        if (inst != null) {
            if (instList.contains(inst)) {
                this.instList.remove(inst);
            }
        }
    }

    // getters de los arraylist
    public ArrayList<String> getGenList() {
        return new ArrayList<>(genList);
    }

    public ArrayList<String> getLangList() {
        return new ArrayList<>(langList);
    }

    public ArrayList<String> getInstList() {
        return new ArrayList<>(instList);
    }

    @Override
    public double getAge() {
        return this.age;
    }

    @Override
    public ArrayList<Participant> getMembers() {
        ArrayList<Participant> copy = new ArrayList<>();
        copy.add(this);
        return copy;
    }

    @Override
    public ArrayList<Participant> buscar(Filtro f) {
        ArrayList<Participant> copy = new ArrayList<>();
        if (f.cumple(this)) {
            copy.add(this);
        }
        return copy;
    }
}
