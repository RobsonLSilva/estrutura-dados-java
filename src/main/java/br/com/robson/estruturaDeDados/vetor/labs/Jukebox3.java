package br.com.robson.estruturaDeDados.vetor.labs;

import br.com.robson.estruturaDeDados.vetor.Song;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox3 {

    ArrayList<Song> songs = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox3().go();
    }

    private void go() {
        getSongs();
        System.out.println(songs);
        Collections.sort(songs);
        System.out.println(songs);
    }

    private void getSongs() {
        try {
            File file = new File("src/main/resources/SongListMore.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null){
                addSong(line);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song song = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songs.add(song);
    }
}
