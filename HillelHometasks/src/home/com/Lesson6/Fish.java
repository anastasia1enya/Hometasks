package home.com.Lesson6;

public class Fish extends Pets implements Cloneable{
    public Fish(String id, double age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void voice() {
        System.out.println("......");
    }

    @Override
    public void move() {
        System.out.println("I like to swim, bool bool ");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
