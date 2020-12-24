package GameCreator;

public abstract class Person {

    private Rasa rasa;
    private String name;

    private int health;
    private int stamina;
    private  int mana;
    private int strength;

    private Items lHand;

    public Rasa getRasa() {
        return rasa;
    }

    public void setRasa(Rasa rasa) {
        this.rasa = rasa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Items getlHand() {
        return lHand;
    }

    public void setlHand(Items lHand) {
        this.lHand = lHand;
    }

    public Items getrHand() {
        return rHand;
    }

    public void setrHand(Items rHand) {
        this.rHand = rHand;
    }

    public Boosts[] getBoosts() {
        return boosts;
    }

    public void setBoosts(Boosts[] boosts) {
        this.boosts = boosts;
    }

    private Items rHand;

    private Boosts [] boosts = new Boosts[4];

    private boolean turn;

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }
}
