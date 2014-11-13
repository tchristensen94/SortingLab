/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import lab1.Song;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author tim
 */
public class Startup {
    public static void main(String[] args) {
        Map<String, Song> songs = new LinkedHashMap<>();
        Song s1 = new Song("A Song", "An Artist", 4, 2001);
        Song s2 = new Song("2 Song", "2 Artist", 5, 2003);
        Song s3 = new Song("3 Song", "3 Artist", 6, 2005);
        Song s4 = new Song("4 Song", "4 Artist", 3, 2007);
        
        songs.put(s1.getSongName(), s1);
        songs.put(s2.getSongName(), s2);
        songs.put(s3.getSongName(), s3);
        songs.put(s4.getSongName(), s4);
        
        for(String k : songs.keySet()) {
            System.out.println(songs.get(k).toString());
        }
        
    }
}
