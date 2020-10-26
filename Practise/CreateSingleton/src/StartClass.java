public class StartClass {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();

        singleton.setAuthor("Top");

        System.out.println(singleton.getAuthor());
        System.out.println(singleton1.getAuthor());

    }
}
