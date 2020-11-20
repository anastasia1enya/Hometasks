package home.com.Lesson5;

public class Cat extends Pets {
    @Override
    public String voice() {
        return super.voice()+ ". Meow! ";
    }

    public Cat(String id, double age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public String love() {
        return super.love()+ "But myself i love more ♥";
    }
}
