public class Singleton {
    private static Singleton singleton;
    private String author;

    private  Singleton(){}

    public static Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

}
