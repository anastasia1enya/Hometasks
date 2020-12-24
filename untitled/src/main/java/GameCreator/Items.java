package GameCreator;

public enum Items {

    SHIELD(50,0),
    SWORD(25,100);


    public int def;
    public int ataka;

    Items(int def, int ataka) {
        this.def = def;
        this.ataka = ataka;
    }
}
