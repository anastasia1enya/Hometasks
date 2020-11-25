package home.com.Lesson6;

public class Animals {


    private String id;
    // создаем конструктор
    public Animals(String id, double age, double weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

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


}
