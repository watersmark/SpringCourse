package ru.main;

import org.springframework.stereotype.Component;

@Component
public class Computer {
    private MusicPlayer player;


    public Computer(MusicPlayer player){
        this.player = player;
    }

    public void getMusic(){
        this.player.playMusic();
        System.out.println("End playlist");
    }
}
