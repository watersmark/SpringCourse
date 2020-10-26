abstract class Music {
    public String name;

    Music(String name){
        this.name = name;
    }

    public abstract void play();

    public abstract void compos();

}

final class Rock extends Music {

    Rock(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Roccccc");
    }

    @Override
    public void compos() {
        System.out.println("Powerwolf");
    }

    public void SpecialF() {
        System.out.println("Special1");
    }
}

class Classic extends Music {

    public Classic(String name){
        super(name);
        System.out.println("Classic create");
    }

    @Override
    public void play() {
        System.out.println("Classic");
    }

    @Override
    public void compos() {
        System.out.println("Corsacov");
    }

    public void specialM() {
        System.out.println("Special2");
    }
}


public class mains {

    public static void main(String[] args) {
        Music mus1 = new Rock("Orn");
        Music mus2 = new Classic("Torn");

        //System.out.println(mus1.compos());
        mus1.compos();
        mus2.compos();

        ((Rock) mus1).SpecialF();
        ((Classic) mus2).specialM();

        System.out.println(mus1.name);
    }


}
