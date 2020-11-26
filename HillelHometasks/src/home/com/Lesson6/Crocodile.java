package home.com.Lesson6;

public class Crocodile extends Predators implements Cloneable {
    public Crocodile(String id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Very slowly!");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
