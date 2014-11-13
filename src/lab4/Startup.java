/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import lab1.Song;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/**
 *
 * @author tim
 */
public class Startup {
    public static void main(String[] args) {
        TreeSet<Song> songs = new TreeSet<>();
        Song s1 = new Song("A Song", "An Artist", 4, 2001);
        Song s2 = new Song("2 Song", "2 Artist", 5, 2003);
        Song s3 = new Song("3 Song", "3 Artist", 6, 2005);
        Song s4 = new Song("4 Song", "4 Artist", 3, 2007);
        
        songs.add(s1);
        songs.add(s2);
        songs.add(s3);
        songs.add(s4);       
        
        
            
        Iterator<Song> i = songs.iterator();
        while(i.hasNext()) {
            System.out.println(i.next().toString());
        }
        
    }
}
