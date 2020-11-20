package home.com.Lesson5;

public class Wolf extends Predators {

    @Override
    public String hunt() {
        return super.hunt() + " Auf!";
    }

    @Override
    public String move() {
        return super.move()+ " Very Fast!";
    }
}
