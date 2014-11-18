/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Comparator;
import lab1.Song;

import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author tim
 */
public class SongLength implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        return new CompareToBuilder()
            .append(o1.getSongLength(), o2.getSongLength())
            .toComparison();
    }
    
}
