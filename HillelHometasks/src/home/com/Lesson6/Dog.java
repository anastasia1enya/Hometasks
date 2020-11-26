package home.com.Lesson6;

public class Dog extends Pets implements Cloneable {

    public Dog(String id, double age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println(". Woof! ");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Especially to play with him.");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
