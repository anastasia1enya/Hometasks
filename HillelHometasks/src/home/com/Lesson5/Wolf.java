package home.com.Lesson5;

public class Wolf extends Predators {

    @Override
    public String hunt() {
        return super.hunt() + " Auf!";
    }

    public Wolf(String id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public String move() {
        return super.move()+ " Very Fast!";
    }
}
