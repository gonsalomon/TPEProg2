package TPE;

import java.util.ArrayList;

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
        ArrayList<String> copy = new ArrayList<>();
        for (String gen : genList) {
            if (!copy.contains(gen)) {
                copy.add(gen);
            }
        }
        return copy;
    }

    public ArrayList<String> getLangList() {
        ArrayList<String> copy = new ArrayList<>();
        for (String lang : langList) {
            if (!copy.contains(lang)) {
                copy.add(lang);
            }
        }
        return copy;
    }

    public ArrayList<String> getInstList() {
        ArrayList<String> copy = new ArrayList<>();
        for (String inst : instList) {
            if (!copy.contains(inst)) {
                copy.add(inst);
            }
        }
        return copy;
    }

    @Override
    public double getAge() {
        return this.age;
    }
}
