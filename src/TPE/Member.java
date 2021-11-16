package TPE;

import java.util.ArrayList;

public class Member extends Participant {

    public Member(String name, String surname, int age) {
        super(name + " " + surname, age);
        this.genList = new ArrayList<>();
        this.langList = new ArrayList<>();
        this.instList = new ArrayList<>();
        this.miembros = null;
    }

    @Override
    public ArrayList<Participant> getMembers() {
        return null;
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
        return new ArrayList<String>(this.genList);
    }

    public ArrayList<String> getLangList() {
        return new ArrayList<String>(this.langList);
    }

    public ArrayList<String> getInstList() {
        return new ArrayList<String>(this.instList);
    }

    @Override
    public double getAge() {
        return this.age;
    }
}
