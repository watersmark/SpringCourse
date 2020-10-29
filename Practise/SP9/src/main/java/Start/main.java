package Start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        MusicPlayer player1 = context.getBean("mus", MusicPlayer.class);
        MusicPlayer player2 = context.getBean("mus", MusicPlayer.class);

        System.out.println(player1 == player2);

    }
}
