package ru.main;

import org.springframework.stereotype.Component;

@Component("classic")
public class ClassicalMusic implements Music {

    @Override
    public String getSongs(){
        return "Rhapsody";
    }
}
