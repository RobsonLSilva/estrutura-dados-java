package br.com.robson.estruturaDeDados.vetor;

public class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private String rating;
    private String bpm;

    public Song() {
    }

    public Song(String title, String artist, String rating, String bpm) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;
    }

    public int compareTo(Song song){
        return title.compareTo(song.getTitle());
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return getTitle();
    }
}
