package home.com.Lesson6;


public class Main {
    public static void main(String[] args) {
        Wild2 w = new Wild2("lion",58, 85, "Blsck",true );
        w.move();
        w.voice();
        w.printInfo();
        w.isPredator();
        Pets2 p = new Pets2("ppgpp",85,78,"black","Marsik",true);
        p.love();
        p.voice();
        p.printInfo();
        p.move();
    }
}
