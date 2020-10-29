package ru.main;

import java.util.ArrayList;

public class MusicList {
    private ArrayList<Music> list = new ArrayList<Music>();

    public MusicList(RockMusic rock, ClassicalMusic classic, PopMusic pop) {
        list.add(rock);
        list.add(classic);
        list.add(pop);
    }

    public ArrayList<Music> getList(){
        return list;
    }

}
