package Start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        MusicPlayer player = context.getBean("mus", MusicPlayer.class);



    }
}
