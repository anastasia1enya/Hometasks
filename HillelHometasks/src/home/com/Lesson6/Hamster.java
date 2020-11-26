package home.com.Lesson6;

public class Hamster extends Pets implements Cloneable {
    public Hamster(String id, double age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void move() {
        System.out.println("I like to move in my circle");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
