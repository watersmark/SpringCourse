package useClass;

public class MusicPlayer {
    private Music music = null;
    private String compos = "Unknown";

    public MusicPlayer(Music music) {
        this.music = music;
    }



    public void doInMyInit() {
        System.out.println("Init method");
    }

    public void doInMyDestroy() {
        System.out.println("Destroy method");
    }


    // play music
    public void playMusic() {
        System.out.println(music.getSongs());
    }

    // For compos
    public void getCompos() {
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
