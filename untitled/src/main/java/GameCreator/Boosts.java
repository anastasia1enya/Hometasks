package GameCreator;

public enum Boosts {
    MANA_REGEN (5),
    HEALTH_REGEN(15);

    private int value;

    Boosts(int value) {
        this.value = value;
    }
}
