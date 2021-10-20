package com.company;

import java.util.ArrayList;

public class Song {
    private String title;
    private ArrayList<String> langList;
    private ArrayList<String> genList;
    private ArrayList<String> instList;

    public Song(String title){
        this.title = title;
        this.langList = new ArrayList<>();
        this.genList = new ArrayList<>();
        this.instList = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getLangList() {
        return new ArrayList<String>(this.langList);
    }

    public void setLangList(ArrayList<String> langList) {
        //todo
    }

    public ArrayList<String> getGenList() {
        return new ArrayList<String>(this.genList);
    }

    public void setGenList(ArrayList<String> genList) {
        //todo
    }

    public ArrayList<String> getInstList() {
        return new ArrayList<String>(this.instList);
    }

    public void setInstList(ArrayList<String> instList) {
        //todo
    }
}
