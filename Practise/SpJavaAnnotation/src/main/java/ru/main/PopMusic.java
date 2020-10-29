package ru.main;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music{

    @Override
    public String getSongs() {
        return "Baskov songs";
    }

}
