package home.com.Lesson6;

public class Wolf extends Predators {

    public Wolf(String id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);

    }

    @Override
    public void hunt() {
        super.hunt();
        System.out.println(" Auf!");
    }
    @Override
    public void move() {
        super.move();
        System.out.println(" Very Fast!");
    }
}
