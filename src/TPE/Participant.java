package TPE;

import java.util.ArrayList;

public abstract class Participant {
    protected String name;
    protected int age;
    protected ArrayList<String> genList;
    protected ArrayList<String> langList;
    protected ArrayList<String> instList;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
        genList = new ArrayList<String>();
        langList = new ArrayList<String>();
        instList = new ArrayList<String>();
    }

    public abstract double getAge();

    public String getName() {
        return name;
    }

    public abstract ArrayList<String> getGenList();

    public abstract ArrayList<String> getLangList();

    public abstract ArrayList<String> getInstList();
}
