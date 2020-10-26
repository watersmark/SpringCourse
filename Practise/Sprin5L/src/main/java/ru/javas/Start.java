package ru.javas;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application.xml"
        );

        List<Music> mus = new ArrayList<Music>();
        mus.add(new ClassicMusic());
        mus.add(new RockMusic());

        PlayerMusic player = context.getBean("playerBean", PlayerMusic.class);
       // player.setMusic(mus);
        player.playMusic();
        System.out.println(player.getName());
        System.out.println(player.getAge());



        System.out.println("end work");
    }
}
