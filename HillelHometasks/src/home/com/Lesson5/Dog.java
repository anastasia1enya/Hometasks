package home.com.Lesson5;

public class Dog extends Pets {

    public Dog(String id, double age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public String voice() {
        return super.voice() + ". Woof! ";
    }

    @Override
    public String love() {
        return super.love() + "Especially to play with him.";
    }
}
