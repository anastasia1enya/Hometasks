package home.com.Lesson6;

public class Giraffe extends Wild implements Cloneable {
    public Giraffe(String id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("And seeing at the sun. ");

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
