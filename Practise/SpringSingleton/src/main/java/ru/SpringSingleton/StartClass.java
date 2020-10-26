package ru.SpringSingleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import useClass.Music;
import useClass.MusicPlayer;

public class StartClass {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer player2 = context.getBean("musicPlayer", MusicPlayer.class);
        player2.getCompos();

        player1.setCompos("Corsica");

        player1.getCompos();
        player2.getCompos();

    }
}
