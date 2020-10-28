package useClass;

public class ClassicMusic implements Music {
    public void init(){
        System.out.println("inF");
    }

    public void dest(){
        System.out.println("destrS");
    }


    private ClassicMusic(){}

    public static ClassicMusic createClassicalMusic(){
        return new ClassicMusic();
    }

    @Override
    public String getSongs() {
        return "Rhapsody";
    }
}
