package home.com.Lesson5;


public class Giraffe extends Wild  {
    public Giraffe(String id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public String move() {
        return super.move() +"And seeing at the sun. ";
    }
}
