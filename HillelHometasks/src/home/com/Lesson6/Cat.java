package home.com.Lesson6;

public class Cat extends Pets {

    public Cat(String id, double age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println(" Meow!");
    }

    @Override
    public void love() {
        super.love();
        System.out.println("But myself i love more ♥");
    }
}
