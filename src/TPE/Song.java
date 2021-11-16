package TPE;

import java.util.ArrayList;

public class Song {
    private String title;
    private ArrayList<String> langList;
    private ArrayList<String> genList;
    private ArrayList<String> instList;

    public Song(String title) {
        this.title = title;
        this.langList = new ArrayList<>();
        this.genList = new ArrayList<>();
        this.instList = new ArrayList<>();
    }

    public boolean canPerformIt(Participant p) {
        if (p.getLangList().containsAll(this.langList) && p.getGenList().containsAll(this.genList)
                && p.getInstList().containsAll(this.instList)) {
            return true;
        }
        return false;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getLangList() {
        return new ArrayList<String>(this.langList);
    }

    public void addLang(String lang) {
        if (lang != null) {
            if (!this.langList.contains(lang)) {
                this.langList.add(lang);
            }
        }
    }

    public void removeLang(String lang) {
        if (lang != null) {
            if (this.langList.contains(lang)) {
                this.langList.remove(lang);
            }
        }
    }

    public ArrayList<String> getGenList() {
        return new ArrayList<String>(this.genList);
    }

    public void addGen(String gen) {
        if (gen != null) {
            if (!this.langList.contains(gen)) {
                this.langList.add(gen);
            }
        }
    }

    public void removeGen(String gen) {
        if (gen != null) {
            if (this.langList.contains(gen)) {
                this.langList.remove(gen);
            }
        }
    }

    public ArrayList<String> getInstList() {
        return new ArrayList<String>(this.instList);
    }

    public void addInst(String inst) {
        if (inst != null) {
            if (!this.instList.contains(inst)) {
                this.instList.add(inst);
            }
        }
    }

    public void removeInst(String inst) {
        if (inst != null) {
            if (this.instList.contains(inst)) {
                this.instList.remove(inst);
            }
        }
    }
}
