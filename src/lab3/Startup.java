/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import lab1.Song;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author tim
 */
public class Startup {
    public static void main(String[] args) {
        TreeMap<String, Song> songs = new TreeMap<>();
        Song s1 = new Song("A Song", "An Artist", 4, 2001);
        Song s2 = new Song("2 Song", "2 Artist", 5, 2003);
        Song s3 = new Song("3 Song", "3 Artist", 6, 2005);
        Song s4 = new Song("4 Song", "4 Artist", 3, 2007);
        
        songs.put(s1.getSongName(), s1);
        songs.put(s2.getSongName(), s2);
        songs.put(s3.getSongName(), s3);
        songs.put(s4.getSongName(), s4);
        
        Collection c = songs.values();
        List c2 = new ArrayList(c);
        Collections.sort(c2);
        
            
        for(Map.Entry<String, Song> song : songs.entrySet()) {
            System.out.println(song.getValue().toString());
        }
       
        
    }
}
