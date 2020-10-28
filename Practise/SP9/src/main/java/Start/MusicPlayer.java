package Start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mus")
public class MusicPlayer {
    private Music music;

    @Autowired
    public MusicPlayer(ClassicMusic music) {
       this.music = music;
       System.out.println(this.music.getSongs());
    }

    public Music getMusic() {
        return music;
    }

    @Autowired
    public void setMusic(RockMusic musics) {
        this.music = musics;
        System.out.println(this.music.getSongs());
    }

    public void playMusic() {
        System.out.println(music.getSongs());
    }

}
