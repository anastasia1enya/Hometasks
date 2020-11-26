package home.com.Lesson5;



public class Crocodile extends Predators  {
    public Crocodile(String id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public String move() {
        return super.move() + "Very slowly... ";
    }
}
