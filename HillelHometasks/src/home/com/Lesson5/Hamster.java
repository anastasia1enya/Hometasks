package home.com.Lesson5;

import java.io.Serializable;

public class Hamster extends Pets implements Serializable {

    public Hamster(String id, double age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public String move() {
        return  "I like to move in my circle";
    }
}
