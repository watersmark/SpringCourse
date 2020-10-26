package useClass;

public class MusicPlayer {
    private Music music = null;
    private String compos = "Unknown";

    MusicPlayer(Music music){
        this.music = music;
    }

    // play music
    public void playMusic(){
        System.out.println(music.getSongs());
    }

    // For compos
    public void getCompos(){
        System.out.println(compos);
    }

    public void setCompos(String compos) {
        this.compos = compos;
    }

    // For music
    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
