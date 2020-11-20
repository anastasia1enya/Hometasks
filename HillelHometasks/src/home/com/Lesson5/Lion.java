package home.com.Lesson5;

public class Lion extends Predators {

    public Lion(String id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public String hunt() {
        return super.hunt() + "I am a king!";
    }
}
