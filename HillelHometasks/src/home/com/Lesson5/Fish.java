package home.com.Lesson5;


public class Fish extends Pets  {
    @Override
    public String voice() {
        return "......";
    }

    @Override
    public String move() {
        return "I like to swim, bool bool ";
    }

    public Fish(String id, double age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }
}
