/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lab1.Song;


/**
 *
 * @author tim
 */
public class Startup {
    public static void main(String[] args) {
        List<Song> songs = new ArrayList<>();
        Song s1 = new Song("A Song", "An Artist", 4, 2001);
        Song s2 = new Song("2 Song", "2 Artist", 5, 2003);
        Song s3 = new Song("3 Song", "3 Artist", 6, 2005);
        Song s4 = new Song("4 Song", "4 Artist", 3, 2007);
        
        songs.add(s1);
        songs.add(s2);
        songs.add(s3);
        songs.add(s4);       
        
        Collections.sort(songs);
            
        for(Song s : songs) {
            System.out.println(s.toString());
        }
        
    }
}
