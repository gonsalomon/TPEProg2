package TPE;

import java.util.ArrayList;

public class Preference {

    private ArrayList<String> langs;
    private ArrayList<String> insts;
    private ArrayList<String> gens;

    public Preference() {
        this.langs = new ArrayList<>();
        this.insts = new ArrayList<>();
        this.gens = new ArrayList<>();
    }

    public ArrayList<String> getLangs() {
        return new ArrayList<String>(langs);
    }

    public void addLang(String l) {
        if(!langs.contains(l)){
            langs.add(l);
        }
    }

    public void delLang(String l) {
        for (String lang:langs) {
            if (lang.equals(l)) langs.remove(lang);
        }
    }

    public ArrayList<String> getInsts() {
        return new ArrayList<String>(insts);
    }

    public void addInst(String inst) {
        if(!insts.contains(inst)){
            insts.add(inst);
        }
    }

    public void delInst(String in) {
        for (String inst:insts) {
            if (inst.equals(in)) insts.remove(inst);
        }
    }

    public ArrayList<String> getGens() {
        return new ArrayList<String>(gens);
    }

    public void addGen(String g) {
        if(!gens.contains(g)){
            gens.add(g);
        }
    }

    public void delGen(String g) {
        for (String gen:gens) {
            if (gen.equals(g)) gens.remove(gen);
        }
    }
}
