package TPE;

import java.util.ArrayList;

public class Participant {
    private String name;
    private String surname;
    private int age;
    private ArrayList<String> genList;
    private ArrayList<String> langList;
    private ArrayList<String> instList;

    public Participant(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.genList = new ArrayList<>();
        this.langList = new ArrayList<>();
        this.instList = new ArrayList<>();
    }

    //getter & setter of "primitive" types (not arrayList)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //arrayList getter & "setter"
    public ArrayList<String> getGenList() {
        return new ArrayList<String>(this.genList);
    }
    public void setGenList(ArrayList<String> genList) {
        //todo
    }

    public ArrayList<String> getLangList() {
        return new ArrayList<String>(this.langList);
    }

    public void setLangList(ArrayList<String> langList) {
        //todo
    }

    public ArrayList<String> getInstList() {
        return new ArrayList<String>(this.instList);
    }

    public void setInstList(ArrayList<String> instList) {
        //todo
    }
}
