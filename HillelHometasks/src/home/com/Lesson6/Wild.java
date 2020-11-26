package home.com.Lesson6;

public class Wild extends Animals implements AnimalsInterface,WildInterface {

    // перемнная только для хищных животных
    private boolean isPredator;
    //// геттеры/сеттеры
    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public Wild(String id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }
    // стандартные методы для всех животных + особенности


    @Override
    public void voice() {
        System.out.println("Hello, I am a wild animal");
    }

    @Override
    public void move() {

        System.out.println("I like to move on the fresh air!");

    }

    @Override
    public void printInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Age: " + getAge() + " year(s)");
        System.out.println("Color: " + getColor());
        System.out.println("Weight: " + getWeight() + " kg(s)");

    }

    @Override
    public void Predator() {
        System.out.println("IsPredator: " + isPredator);

    }
}
