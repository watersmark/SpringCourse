package ru.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        musicPlayer1.playMusic();
//        musicPlayer2.playMusic();
//
//        System.out.println(musicPlayer1 == musicPlayer2);

        ClassicalMusic mus1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic mus2 = context.getBean("classicalMusic", ClassicalMusic.class);
        

        System.out.println(mus1 == mus2);
    }
}
