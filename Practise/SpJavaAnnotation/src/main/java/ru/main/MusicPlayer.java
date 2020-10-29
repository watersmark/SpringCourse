package ru.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("musPlay")
@Scope("prototype")
public class MusicPlayer {
    private ArrayList<Music> list = new ArrayList<Music>();

    @Autowired
    public MusicPlayer(MusicList list) {
        this.list = list.getList();
    }

    public void playMusic() {
        for(Music mus : list){
            System.out.println(mus.getSongs());
        }
    }
}
