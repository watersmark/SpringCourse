package packTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class start {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "application.xml"
        );

        Music classic = context.getBean("musicBean", Music.class);
        System.out.println(classic.getSongs());
        MusicPlayer player = new MusicPlayer(classic);
        player.playMusic();

        System.out.println("End work");
    }
}
