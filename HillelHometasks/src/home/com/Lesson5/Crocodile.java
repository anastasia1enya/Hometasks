package home.com.Lesson5;

public class Crocodile extends Predators {
    @Override
    public String move() {
        return super.move() + "Very slowly... ";
    }
}
