package classroom.Lesson7;

public class Example {

    public static void main(String[] args) {
        Car2 car = new Car2();
        System.out.println(car.getRadio());

    }
}
class Car2 {
    private Radio2 radio;

    public Radio2 getRadio() {
        return radio;
    }

    public void setRadio(Radio2 radio) {
        this.radio = radio;
    }

    public Car2 (){

    }

}

class Radio2{
    private String name;
    public Radio2(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}