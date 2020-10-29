package ru.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("musPlay")
@Scope("prototype")
public class MusicPlayer {
    private Music music;
    private Music music1;

    @Autowired
    public MusicPlayer(@Qualifier("rock") Music music, @Qualifier("classic") Music music1) {
        this.music = music;
        this.music1 = music1;
    }

    public void playMusic() {
        System.out.println(music.getSongs());
        System.out.println(music1.getSongs());
    }

    public void initMethod(){

    }

}
