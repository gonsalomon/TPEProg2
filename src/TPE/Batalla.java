package TPE;

import java.util.ArrayList;
import TPE.compare.Compare;

public class Batalla {
    private ArrayList<Song> songList;
    private Coach c1;
    private Coach c2;

    public Batalla(Coach c1, Coach c2) {
        this.songList = new ArrayList<>();
        this.c1 = c1;
        this.c2 = c2;
    }

    public int compete(Compare cond){
        return cond.compare(c1.assembleTeam(this), c2.assembleTeam(this));
    }

    //getter/setter methods
    public Coach getC1() {
        Coach copy1 = new Coach(c1.getName(),c1.getSurname());
        return copy1;
    }

    public Coach getC2() {
        Coach copy2 = new Coach(c2.getName(),c2.getSurname());
        return copy2;
    }

    public void addSong(Song song) {
        if (song != null) {
            if (!songList.contains(song)) {
                songList.add(song);
            }
        }
    }

    public void delSong(Song song) {
        if (song != null) {
            if (songList.contains(song)) {
                songList.remove(song);
            }
        }
    }

    public ArrayList<Song> getSongs(){
        return new ArrayList<Song>(songList);
    }
}
