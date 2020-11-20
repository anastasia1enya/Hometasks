package home.com.Lesson5;

public class Pets extends Animals {
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
   // стандартные методы для всех животных + особенности
    @Override
    public String voice() {
        return super.voice() + " my name is " + name;
    }

    @Override
    public String move() {
        return super.move() + " around the house";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Name: " + getName());
        System.out.println("IsVaccinated: " + isVaccinated());
    }
    // метод только для домашних животных
    public String love() {
        return "I love my owner!";
    }

}
