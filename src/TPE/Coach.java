package TPE;

import java.util.ArrayList;
//ArrayList<String> (para copypaste, es un poco largo tipearlo)
public class Coach {
    private String name;
    private String surname;
    private ArrayList<Participant> team;

    public Coach(String nombre, String apellido) {
        this.name = nombre;
        this.surname = apellido;
    }
    //methods
    public void teamAdd(Participant p){
        this.team.add(p);
    };

    public ArrayList<String> getTeamInst (){
        ArrayList<String> copy = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            for (String inst:team.get(i).getInstList()) {
                if (!copy.contains(inst)){
                    copy.add(inst);
                }
            }
        }
        return copy;
    }
    public ArrayList<String> getTeamLang (){
        ArrayList<String> copy = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            for (String lang:team.get(i).getLangList()) {
                if (!copy.contains(lang)){
                    copy.add(lang);
                }
            }
        }
        return copy;
    }
    public ArrayList<String> getTeamGen (){
        ArrayList<String> copy = new ArrayList<>();
        for (int i = 0; i < team.size(); i++) {
            for (String gen:team.get(i).getGenList()) {
                if (!copy.contains(gen)){
                    copy.add(gen);
                }
            }
        }
        return copy;
    }

    public double getTeamAgeAVG (){
        int partial = 0;
        for (int i = 0; i < team.size(); i++) {
            partial+=this.team.get(i).getAge();
        }
        return partial/team.size();
    }
}