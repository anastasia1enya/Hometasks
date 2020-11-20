package home.com.Lesson5;

    //создаем главный класс

public class Animals {
    private String id;
    private double age;
    private double weight;
    private String color;

    // геттеры / сеттеры

    public String getId() { return id; }

    public void setId(String id) {
        this.id = id;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //методы, для всех животных
    public String voice() {
        return "Hello, ";
    }

    public String move() {
        return "I like to move";
    }

    public void printInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Age: " + getAge() + " year(s)");
        System.out.println("Color: " + getColor());
        System.out.println("Weight: " + getWeight() + " kg(s)");

    }

}
