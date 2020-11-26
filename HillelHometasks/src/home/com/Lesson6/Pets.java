package home.com.Lesson6;

public class Pets extends Animals implements AnimalsInterface,PetInterface{
    // перемнные только для домащних животных:
    private String name;
    private boolean isVaccinated;

    public Pets(String id, double age, double weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    // геттеры/сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }
    //// стандартные методы для всех животных + особенности
    @Override
    public void voice() {
        System.out.println("Hello, my name is " + name);
    }

    @Override
    public void move() {
        System.out.println("I like to move around the house");
    }

    @Override
    public void printInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Age: " + getAge() + " year(s)");
        System.out.println("Color: " + getColor());
        System.out.println("Weight: " + getWeight() + " kg(s)");
        System.out.println("Name: " + getName());
    }

    @Override
    public void Vaccinated() {
        System.out.println("IsVaccinated: " + isVaccinated());

    }

    @Override
    public void love() {
        System.out.println("I love my owner!");

    }
}
