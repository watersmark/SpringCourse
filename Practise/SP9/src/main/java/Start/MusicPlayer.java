package Start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("mus")
@Scope("prototype")
public class MusicPlayer {

    @Value("${name}")
    private String name;

    @Value("${volume}")
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private Music music1;
    private Music music2;


    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic() {
        System.out.println(music1.getSongs());
        System.out.println(music2.getSongs());
    }
    
    @PostConstruct
    public void doMyInit(){
        System.out.println("Start init");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Do my destroy");
    }
}