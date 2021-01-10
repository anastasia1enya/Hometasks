package HW14;

public class Player extends Players  {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    Player(String name){
        this.name=name;
        System.out.println("Welcome to  the game, "+name);
    }


}
