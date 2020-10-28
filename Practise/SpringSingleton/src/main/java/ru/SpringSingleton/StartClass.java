package ru.SpringSingleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import useClass.Music;
import useClass.MusicPlayer;

public class StartClass {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
        player1.getCompos();
        System.out.println(player1.getMusic().getSongs());

        System.out.println("End program");


    }
}
