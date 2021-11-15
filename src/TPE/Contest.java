package TPE;

import java.util.ArrayList;

import TPE.compare.Compare;

public class Contest {
    ArrayList<Song> songList;
    ArrayList<Coach> coachList;
    ArrayList<Participant> partList;

    public Contest() {
        this.songList = new ArrayList<>();
        this.coachList = new ArrayList<>();
        this.partList = new ArrayList<>();
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

    /*
     * se requiere proveer un ArrayList de Compares (que serían las reglas de la
     * batalla) desde donde se ponga a andar una competencia (el main en mi caso)
     */
    public int batalla(Participant p1, Participant p2, ArrayList<Compare> rules) {
        int result = 0;
        for (int i = 0; i < rules.size(); i++) {
            if (rules.get(i).compare(p1, p2) == 0) {
                ArrayList<Compare> newRules = new ArrayList<Compare>(rules);
                newRules.remove(i);
                result += batalla(p1, p2, newRules);
            }
            result += rules.get(i).compare(p1, p2);
        }
        if (result < 0) {
            return -1;
        } else if (result > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
