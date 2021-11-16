package TPE;

import java.util.ArrayList;

public class SongList {
    private ArrayList<Song> songs;

    public SongList() {
        songs = new ArrayList<Song>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public ArrayList<Song> getSongs() {
        return new ArrayList<Song>(songs);
    }

    // no sé cómo incluir librerías que ya traigan estas canciones como campo final,
    // e incluso si lo hacen, tengo que hacerlo con la estructura que le di a la
    // canción
    public void addSongs() {
        songs.add(new Song("Smells Like Teen Spirit"));
        songs.add(new Song("Come As You Are"));
        songs.add(new Song("Imagine"));
        songs.add(new Song("In Bloom"));
        songs.add(new Song("One"));
        songs.add(new Song("Billie Jean"));
        songs.add(new Song("Creep"));
        songs.add(new Song("Bohemian Rhapsody"));
        songs.add(new Song("Wish You Were Here"));
        songs.add(new Song("Hey Jude"));
        songs.add(new Song("Yesterday"));
        songs.add(new Song("Like A Rolling Stone"));
        songs.add(new Song("Sgt. Pepper's Lonely Hearts Club Band"));
        songs.add(new Song("I Can't Get No Satisfaction"));
        songs.add(new Song("God Save The Queen"));
        songs.add(new Song("Sweet Child O' Mine"));
        songs.add(new Song("You're My Best Friend"));
        songs.add(new Song("London Calling"));
        songs.add(new Song("Waterloo Sunset"));
        songs.add(new Song("Hotel California"));
        songs.add(new Song("Your Song"));
    }
}
