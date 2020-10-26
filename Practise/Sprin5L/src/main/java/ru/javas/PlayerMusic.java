package ru.javas;

import java.util.ArrayList;
import java.util.List;

public class PlayerMusic {
    private List<Music> music = new ArrayList<Music>();

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    PlayerMusic() {
    }

    PlayerMusic(ArrayList<Music> list) {
        this.music = list;
    }

    public void setMusic(List<Music> mus) {
        this.music = mus;
    }

    public void playMusic() {
        for (Music elem : music) {
            System.out.println(elem.getSongs());
        }
    }

}
