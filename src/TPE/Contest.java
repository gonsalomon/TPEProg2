package TPE;

import java.util.ArrayList;

import TPE.comparators.Comparador;

public class Contest {
    private ArrayList<Song> songList;
    private ArrayList<Coach> coachList;
    private ArrayList<Participant> partList;
    private Comparador condicionVictoria;

    public Contest() {
        this.songList = new ArrayList<>();
        this.coachList = new ArrayList<>();
        this.partList = new ArrayList<>();
        this.condicionVictoria = null;
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

    public ArrayList<Song> getSongs() {
        return new ArrayList<Song>(songList);
    }

    public void addCoach(Coach coach) {
        if (coach != null) {
            if (!coachList.contains(coach)) {
                coachList.add(coach);
            }
        }
    }

    public void delCoach(Coach coach) {
        if (coach != null) {
            if (coachList.contains(coach)) {
                coachList.remove(coach);
            }
        }
    }

    public ArrayList<Coach> getCoaches() {
        return new ArrayList<Coach>(coachList);
    }

    public void addParticipant(Participant part) {
        if (part != null) {
            if (!partList.contains(part)) {
                partList.add(part);
            }
        }
    }

    public void delParticipant(Participant part) {
        if (part != null) {
            if (partList.contains(part)) {
                partList.remove(part);
            }
        }
    }

    public ArrayList<Participant> getParticipants() {
        return new ArrayList<Participant>(partList);
    }

    public Comparador getCondicionVictoria() {
        return condicionVictoria;
    }

    public void setCondicionVictoria(Comparador condicionVictoria) {
        this.condicionVictoria = condicionVictoria;
    }

    public int compete(Coach c1, Coach c2) {
        if (c1 == null || c2 == null) {
            return 0;
        } else {
            return condicionVictoria.compare(c1.assembleTeam(condicionVictoria), c2.assembleTeam(condicionVictoria));
        }
    }
}
