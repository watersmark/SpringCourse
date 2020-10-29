package ru.main;

import org.springframework.stereotype.Component;

@Component("rock")
public class RockMusic implements Music{

    @Override
    public String getSongs() {
        return "We we we will rock you";
    }
}
