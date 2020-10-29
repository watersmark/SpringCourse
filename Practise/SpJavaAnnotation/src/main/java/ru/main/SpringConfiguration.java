package ru.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("ru.main")
public class SpringConfiguration {

    @Bean
    @Scope("prototype")

    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    @Scope("prototype")
    public  MusicPlayer musicPlayer(){
        return new MusicPlayer(rockMusic(), classicalMusic());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
